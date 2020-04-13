package com.wyz.patterndesign.principles.segregation.improve;

/**
 * 做到最小接口
 * 一个类和一个类的依赖应该建立在最小接口上。
 * A依赖B， C依赖D  把原有的Interface1 进行拆分成三个接口 Interface1, Interface2, Interface3
 */
public class Segregation2 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());
        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }
}

interface Interface1 {
    void operation1();
}

interface Interface2 {
    void operation2();

    void operation3();
}

interface Interface3 {
    void operation4();

    void operation5();
}


/**
 * B实现了接口interface1， Interface2
 */
class B implements Interface1, Interface2 {

    @Override
    public void operation1() {
        System.out.println("B implements operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B implements operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B implements operation3");
    }
}

/**
 * D实现了接口interface1,Interface3
 */
class D implements Interface1, Interface3 {

    @Override
    public void operation1() {
        System.out.println("D implements operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D implements operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D implements operation5");
    }
}

/**
 * A类 通过接口 interface1，（使用）依赖了 B类，只使用了1,2,3三个方法
 */
class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface2 i) {
        i.operation2();
    }

    public void depend3(Interface2 i) {
        i.operation3();
    }
}

/**
 * C类 通过 接口interface1 （使用）依赖了 D类，只使用了1,4,5三个方法
 */
class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface3 i) {
        i.operation4();
    }

    public void depend5(Interface3 i) {
        i.operation5();
    }
}