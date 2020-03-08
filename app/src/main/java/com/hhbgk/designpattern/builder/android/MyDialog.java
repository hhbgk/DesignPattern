package com.hhbgk.designpattern.builder.android;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.hhbgk.designpattern.R;

public final class MyDialog extends Dialog implements View.OnClickListener {
    private MyDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.my_dialog);
        TextView titleView = findViewById(R.id.title);
        TextView messageView = findViewById(R.id.message);
        Button positiveButton = findViewById(R.id.positiveBtn);
        Button negativeButton = findViewById(R.id.negativeBtn);

        titleView.setText(title);
        messageView.setText(message);
        positiveButton.setText(positiveButtonText);
        negativeButton.setText(negativeButtonText);
        positiveButton.setOnClickListener(this);
        negativeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        dismiss();
        switch (v.getId()) {
            case R.id.positiveBtn:
                if (positiveListener != null) {
                    positiveListener.onClick(v);
                }
                break;
            case R.id.negativeBtn:
                if (negativeListener != null) {
                    negativeListener.onClick(v);
                }
                break;
        }
    }

    private CharSequence title;
    private CharSequence message;
    private CharSequence positiveButtonText;
    private CharSequence negativeButtonText;
    private View.OnClickListener positiveListener;
    private View.OnClickListener negativeListener;

    public static class Builder {
        private Context mContext;
        private CharSequence mTitle;
        private CharSequence mMessage;
        private CharSequence mPositiveButtonText;
        private CharSequence mNegativeButtonText;
        private View.OnClickListener mPositiveListener;
        private View.OnClickListener mNegativeListener;

        public Builder(Context context) {
            mContext = context;
        }

        public Builder setTitle(String title) {
            mTitle = title;
            return this;
        }

        public Builder setMessage(String message) {
            mMessage = message;
            return this;
        }

        public Builder setPositiveButton(CharSequence text, final View.OnClickListener listener) {
            mPositiveButtonText = text;
            mPositiveListener = listener;
            return this;
        }

        public Builder setNegativeButton(CharSequence text, final View.OnClickListener listener) {
            mNegativeButtonText = text;
            mNegativeListener = listener;
            return this;
        }

        public MyDialog create() {
            MyDialog dialog = new MyDialog(mContext);
            dialog.title = mTitle;
            dialog.message = mMessage;
            dialog.positiveButtonText = mPositiveButtonText;
            dialog.positiveListener = mPositiveListener;
            dialog.negativeButtonText = mNegativeButtonText;
            dialog.negativeListener = mNegativeListener;
            return dialog;
        }
    }
}
