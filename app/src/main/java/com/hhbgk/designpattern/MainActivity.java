package com.hhbgk.designpattern;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hhbgk.designpattern.proxy.dynamicproxy.DynamicProxy;
import com.hhbgk.designpattern.proxy.dynamicproxy.IPlayer;
import com.hhbgk.designpattern.proxy.dynamicproxy.VlcImpl;

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
        IPlayer runnable = new VlcImpl();
        DynamicProxy dynamicProxy = new DynamicProxy();
        IPlayer proxyInstance = (IPlayer) dynamicProxy.newProxyInstance(runnable);
        proxyInstance.play(10);
    }
}
