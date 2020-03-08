package com.hhbgk.designpattern;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.hhbgk.designpattern.ChainOfResponsibility.AbstractLeader;
import com.hhbgk.designpattern.ChainOfResponsibility.Ceo;
import com.hhbgk.designpattern.ChainOfResponsibility.Cto;
import com.hhbgk.designpattern.ChainOfResponsibility.DivisionManager;
import com.hhbgk.designpattern.builder.android.MyDialog;
import com.hhbgk.designpattern.interpreter.Calculator;
import com.hhbgk.designpattern.mediator.AbstractColleague;
import com.hhbgk.designpattern.mediator.Buyer;
import com.hhbgk.designpattern.mediator.IMediator;
import com.hhbgk.designpattern.mediator.Seller;
import com.hhbgk.designpattern.mediator.ServerMediator;
import com.hhbgk.designpattern.memento.Caretaker;
import com.hhbgk.designpattern.memento.Memento;
import com.hhbgk.designpattern.memento.Originator;
import com.hhbgk.designpattern.observer.IObserver;
import com.hhbgk.designpattern.observer.ISubject;
import com.hhbgk.designpattern.observer.Sina;
import com.hhbgk.designpattern.observer.Weather;
import com.hhbgk.designpattern.observer.Yahoo;
import com.hhbgk.designpattern.proxy.dynamicproxy.DynamicProxy;
import com.hhbgk.designpattern.proxy.dynamicproxy.IPlayer;
import com.hhbgk.designpattern.proxy.dynamicproxy.VlcImpl;
import com.hhbgk.designpattern.proxy.staticproxy.IRunnable;
import com.hhbgk.designpattern.proxy.staticproxy.MyThread;
import com.hhbgk.designpattern.proxy.staticproxy.ThreadProxy;
import com.hhbgk.designpattern.state.RedLight;
import com.hhbgk.designpattern.state.TrafficLight;
import com.hhbgk.designpattern.state.YellowLight;
import com.hhbgk.designpattern.strategy.PlaneTravel;
import com.hhbgk.designpattern.strategy.TrainTravel;
import com.hhbgk.designpattern.strategy.Traveler;

import java.util.ArrayList;
import java.util.HashMap;

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

        //建造者模式
//        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
//        Director director = new Director(concreteBuilder);
//        Car car = director.construct();
//        Log.i(tag, "car="+car);
//            new MyDialog.Builder(this).setMessage("Hello").setTitle("Test")
//                .setNegativeButton("No", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                    }
//                })
//                .setPositiveButton("Yes", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                    }
//                })
//                .create()
//                .show();

        //适配器模式之类适配器
//        Laptop laptop = new Laptop();
//        laptop.charging(new LaptopAdapter());

        //适配器模式之对象适配器
//        Pad pad = new Pad();
//        PadAdapter padAdapter = new PadAdapter(new Adaptee());
//        pad.charging(padAdapter);

        //适配器模式之接口适配器
//        new UniversalAdapter() {
//            @Override
//            public int request12V() {
//                int voltage = super.request12V() / 2;
//                Log.i(tag, "request 12V, but adapter to " + voltage);
//                return voltage;
//            }
//        }.request12V();

        //桥接模式
//        IBrand brand = new BenzBrand();
//        CarClass carClass = new AClass(brand);
//        carClass.createCarClass();

        //装饰者模式
//        Drink drink = new BlueMountainCoffee();
//        drink = new Milk(drink);
//        drink = new Sugar(drink);
//        Log.i(tag, drink.getDescription() +"\nadd milk and sugar, all cost: " + drink.getPrice());

        //组合模式
//        MyFiles topFolder = new MyFiles("MyFiles");
//
//        DocumentFolder personal = new DocumentFolder("personal");
//        DocumentFolder work = new DocumentFolder("work");
//
//        Document test = new Document("test.txt");
//
//        personal.add(new Document("fiction.txt"));
//        personal.add(new Document("information.txt"));
//
//        work.add(new Document("program.java"));
//        work.add(new Document("function.c"));
//
//        topFolder.add(test);
//        topFolder.add(personal);
//        topFolder.add(work);
//
//        topFolder.show();

        //外观模式(过程模式)
//        CinemaFacade cinemaFacade = new CinemaFacade();
//        Log.w(tag, "Movie start...");
//        cinemaFacade.start();
//        Log.w(tag, "Movie is over...");
//        cinemaFacade.stop();

        //享元模式
//        FlyweightFactory factory = FlyweightFactory.getInstance();
//
//        IFlyweight black1 = factory.getFlyWeight("black");
//        black1.move(new Coordinate(100, 100));
//        IFlyweight black2 = factory.getFlyWeight("black");
//        black2.move(new Coordinate(200, 200));
//        Log.i(tag, "size=" + factory.getFlyweightSize());

        //代理模式之静态代理
//        IRunnable thread = new MyThread();
//        IRunnable proxy = new ThreadProxy(thread);
//        proxy.run();

        //代理模式之动态代理
        VlcImpl runnable = new VlcImpl();
        DynamicProxy dynamicProxy = new DynamicProxy();
        IPlayer proxyInstance = (IPlayer) dynamicProxy.newProxyInstance(runnable);
        String filepath = proxyInstance.selectFile();
        Log.e(tag, "filepath=" + filepath);
        proxyInstance.play();

        //模板方法模式
//        AbstractCooking basil = new Basil();
//        basil.cookVegetable();
//        AbstractCooking parsley = new Parsley();
//        parsley.cookVegetable();

        //命令模式
//        Waiter waiter = new Waiter();
//        waiter.addCommand("noodles", new NoodlesCommand());
//        waiter.addCommand("pancakes", new PancakesCommand());
//        waiter.sendOrderCommand("noodles");
//        waiter.sendOrderCommand("oo");

        //访问者模式
//        PerformanceAppraisalForm form = new PerformanceAppraisalForm();
//        form.add(new ManagerElement("manager-Tom"));
//        form.add(new ManagerElement("manager-Bob"));
//        form.add(new EngineerElement("engineer-A"));
//        form.add(new EngineerElement("engineer-B"));
//        form.add(new EngineerElement("engineer-C"));
//        form.add(new EngineerElement("engineer-D"));
//        form.add(new EngineerElement("engineer-E"));
//        Log.e(tag, "=========== show form for CEO ===========");
//        form.show(new CeoVisitor());
//        Log.i(tag, "=========== show form for CTO ===========");
//        form.show(new CtoVisitor());

        //迭代器模式
//        AggregateImpl<String> aggregate = new AggregateImpl<>();
//        aggregate.add("a");
//        aggregate.add("b");
//        aggregate.add("c");
//        aggregate.add("d");
//        IIterator i = aggregate.getIterator();
//        while (i.hasNext()) {
//            Log.w(tag, "element:" + i.next());
//        }

        //观察者模式
//        Weather weather = new Weather();
//        weather.register(new Sina());
//        weather.register(new Yahoo());
//
//        weather.change(27.6f);

        //中介者模式
//        IMediator mediator = new ServerMediator();
//        AbstractColleague seller = new Seller(mediator);
//        AbstractColleague buyer = new Buyer(mediator);
//        mediator.register(buyer);
//        mediator.register(seller);
//
//        seller.send();
//        Log.e(tag, "=============");
//        buyer.send();

        //备忘录模式
//        Originator originator = new Originator();
//        Caretaker caretaker = new Caretaker();
//        originator.setState("#0 morning progress 60%");
//        caretaker.add(originator.store());
//
//        originator.setState("#1 noon progress 40%");
//        caretaker.add(originator.store());
//
//        originator.restore(caretaker.getMemento(0));
//        Log.i(tag, "Current state=" + originator.getState());

        //解析器模式
//        String expStr = "3+2-2";
//        Calculator calculator = new Calculator(expStr);
//        Log.i(tag, expStr + "=" + calculator.calculate());

        //状态模式
//        TrafficLight trafficLight = new TrafficLight();
//        trafficLight.setState(TrafficLight.RED_STATE);
//        trafficLight.setLightRed();
//        Log.e(tag, "After 10s:");
//
//        trafficLight.setLightGreen();
//        Log.e(tag, "After 10s:");
//
//        trafficLight.setLightYellow();

        //策略模式
//        Traveler traveler = new Traveler();
//        traveler.setStrategy(new TrainTravel());
//        traveler.travelStyle();
//
//        traveler.setStrategy(new PlaneTravel());
//        traveler.travelStyle();

        //责任链模式
//        AbstractLeader ceo = new Ceo();
//        AbstractLeader cto = new Cto();
//        AbstractLeader divisionManager = new DivisionManager();
//
//        divisionManager.setNext(cto);
//        cto.setNext(ceo);
//        ceo.setNext(divisionManager);
//
//        divisionManager.handleRequest(1);
    }
}
