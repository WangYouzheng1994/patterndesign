package com.wyz.patterndesign.principles.dependecyinversion;

/**
 * 依赖（接口，抽象类）传递
 * 1.通过接口传递（方法的形参）
 * 2.通过构造器
 * 3.setter传递
 */
public class DependencyTrans {
    public static void main(String[] args) {
        // 方法传递
        Changhong changhong = new Changhong();
        TVController tvController = new TVController();
        tvController.aControl(changhong);

        // 构造器传递
        Changhong changhong2 = new Changhong();
        Controller2 controller2 = new Controller2(changhong2);
        controller2.aControl();

        // setter传递
        Changhong changhong3 = new Changhong();
        Controller3 controller3 = new Controller3();
        controller3.setItv(changhong3);
        controller3.aControl();
    }
}

interface IControl {
    void aControl(ITV tv);
}
interface ITV {
    void watch();
}

/**
 * 方法参数传递依赖
 */
class TVController implements IControl {

    @Override
    public void aControl(ITV tv) {
        tv.watch();
    }
}

interface IControl2 {
    void aControl();
}
/**
 * 构造器传递依赖
 */
class Controller2 implements IControl2 {
    private ITV itv;
    public Controller2(ITV itv) {
        this.itv = itv;
    }

    @Override
    public void aControl() {
        this.itv.watch();
    }
}

/**
 * setter传递
 */
class Controller3 implements IControl2 {
    private ITV itv;
    public void setItv(ITV itv) {
        this.itv = itv;
    }
    @Override
    public void aControl() {
        this.itv.watch();
    }
}

class Changhong implements ITV {

    @Override
    public void watch() {
        System.out.println("长虹电视机可以看了");
    }
}