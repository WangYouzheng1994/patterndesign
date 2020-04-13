package com.wyz.patterndesign.principles.singlereposibility;

/**
 * 单一职责：vehicle的run 违反了“单一职责”。
 * 解决方案，根据不同的工具 拆分成不同的类
 */
public class SingleReposibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托");
        vehicle.run("汽車");
        vehicle.run("飛機");
    }
}

class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上運行...");
    }
}
