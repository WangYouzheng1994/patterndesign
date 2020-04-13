package com.wyz.patterndesign.principles.singlereposibility;

/**
 * 单一职责： 遵守單一職責，但是，
 * 1.这样相对于1的改动非常大。
 * 2.将类根据职责重新分解，然后还要修改客户端main()
 * 3.直接修改Vehicle，改动的代码少。
 */
public class SingleReposibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托");
        roadVehicle.run("汽車");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飛機");
    }
}


class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上運行...");

    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天上運行...");
    }
}