package com.wyz.patterndesign.principles.liskov;

/**
 * 里氏替换原则：最经典的反面教材。
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3等于" + a.func1(11, 3));
        System.out.println("3-5等于" + a.func1(3, 5));

        System.out.println("----------------");
        B b = new B ();
        // 本意是调用的 父类的逻辑 但是因为B类重写了func1 所以已经不满足里氏替换原则了
        System.out.println("11-3等于" + b.func1(11, 3));
        System.out.println("3-5等于" + b.func1(3, 5));
        // 本意是调用的 父类的逻辑 但是因为B类重写了func1 所以已经不满足里氏替换原则了
        System.out.println("11-3+9等于" + b.func2(11, 3));
    }
}

/**
 * 两个数相减
 */
class A {
    public int func1(int num, int num2) {
        return num - num2;
    }
}

/**
 *
 */
class B extends A {
    /**
     * 两个数相加 （重写了 爹A 的两数相减）
     * @param num
     * @param num2
     * @return
     */
    @Override
    public int func1(int num, int num2) {
        return num + num2;
    }

    public int func2(int num, int num2) {
        return this.func1(num, num2) + 9;
    }
}
