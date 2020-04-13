package com.wyz.patterndesign.principles.dependecyinversion.improve;

/**
 * 依赖倒转原则：
 * 如果我们获取的不是从邮件，而是从微信、短信等渠道获取消息。那么我们就得改形参。或者重载方法。或者新增一个类。
 * 因此 person的receive就需要重载了。
 * 解决思路：
 * 引入一个抽象的接口 IReceiver表示接受者。然后Person与接口发生依赖。
 * 因为微信、短信、邮件 属于接受者的范畴，那么他们只需要实现IReceiver这个接口就可以了。具体的接收方式各自具体实现。这样就符合了依赖倒转。
 * 那么Person就去依赖了抽象的东西。可便于扩展，可收缩，可扩展。
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息：hello world";
    }
}

/**
 * Person接收消息的功能
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
