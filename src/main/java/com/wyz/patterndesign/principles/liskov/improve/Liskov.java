package com.wyz.patterndesign.principles.liskov.improve;

/**
 * 里氏替换原则：来解决因为子类重写导致了 原有功能的丢失问题。 通过组合聚合的方式 （持有成员变量）来调用。
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3等于" + a.func1(11, 3));
        System.out.println("3-5等于" + a.func1(3, 5));

        System.out.println("----------------");
        B b = new B();
        // 因为B类不继承A类了。因此b.func1的本意就很明显了 他是独立的。 她就是做加法运算。
        System.out.println("11+3等于" + b.func1(11, 3));
        System.out.println("3+5等于" + b.func1(3, 5));
        System.out.println("11+3+9等于" + b.func2(11, 3));

        // 使用组合（聚合）的方式 依然可以调用A类的减法操作。
        System.out.println("11-3等于" + b.func3(11, 3));
    }
}

/**
 * 创建一个基类，把更加基础的基类和成员放到Base类中
 */
class Base {

}

/**
 * 两个数相减
 */
class A extends Base {
    public int func1(int num, int num2) {
        return num - num2;
    }
}

/**
 *
 */
class B extends Base {
    //
    private A a = new A();
    /**
     * 两个数相加 （重写了 爹A 的两数相减）
     * @param num
     * @param num2
     * @return
     */
    public int func1(int num, int num2) {
        return num + num2;
    }

    public int func2(int num, int num2) {
        return this.func1(num, num2) + 9;
    }

    public int func3(int num, int num2) {
        return this.a.func1(num, num2);
    }
}
