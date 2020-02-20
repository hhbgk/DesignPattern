package com.hhbgk.designpattern;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String tag = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //工厂方法模式
//        AbstractBrandFactory xiaomiBrand = new XiaomiBrand();
//        AbstractPhone xiaomiPhone = xiaomiBrand.createPhone("green");
//        xiaomiPhone.start();

        //抽象工厂模式
//        IBrandFactory huaweiFactory = new HuaweiFactory();
//        huaweiFactory.createLaptop().assembly();
//        huaweiFactory.createMobile().design();

        //原型模式之浅拷贝
//        Sheep sheep = new Sheep("White sheep");
//        Sheep copySheep = (Sheep) sheep.clone();
//        copySheep.setName("Black sheep");
//        Log.w(tag, "sheep " + sheep +", copySheep " + copySheep);
//        Log.w(tag, "sheep hashCode == copySheep hashCode ? " + (sheep.hashCode() == copySheep.hashCode()));
        //原型模式之深拷贝 方式一
//        Camera camera = new Camera();
//        camera.setNumber(1);
//        OppoPhone o1 = new OppoPhone("oppo1", camera);
//        OppoPhone o2 = (OppoPhone) o1.clone();
//        Log.w(tag, "after clone:o1 " + o1 +", o2 " + o2);

//        camera.setNumber(100);
//        o2.setName("oppo2");
//        o2.getCamera().setNumber(3);
//        Log.w(tag, "after modified:o1 " + o1 +", o2 " + o2);

        //原型模式之深拷贝 方式二
//        Volume volume = new Volume();
//        volume.setNumber(1);
//        VivoPhone v1 = new VivoPhone("Vivo1", volume);
//        VivoPhone v2 = (VivoPhone) v1.deepClone();
//        Log.w(tag, "after clone:v1 " + v1 +", v2 " + v2);

//        volume.setNumber(100);
//        v2.setName("Vivo2");
//        v2.getVolume().setNumber(3);
//        Log.w(tag, "after modified:v1 " + v1 +", v2 " + v2);

    }
}
