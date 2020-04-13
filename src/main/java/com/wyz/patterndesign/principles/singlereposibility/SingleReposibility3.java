package com.wyz.patterndesign.principles.singlereposibility;

/**
 * 没有对原有的类进行大的修改，只是做了类似的重载（改了名字）
 * 虽然没有在类上做 “单一职责”原则，但是在方法层面是单一职责的。
 */
public class SingleReposibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("船");
    }
}

class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上運行...");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天上運行...");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水上運行...");
    }
}
