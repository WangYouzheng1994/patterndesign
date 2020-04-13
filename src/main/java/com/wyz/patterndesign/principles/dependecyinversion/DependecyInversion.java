package com.wyz.patterndesign.principles.dependecyinversion;

/**
 * 依赖倒转: 客户端无需改变。 传入不同的对象就可以了。 客户端是与接口发生了依赖 而不是与细节发生依赖。
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

/**
 * 抽象一个接受者的接口
 */
interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件信息：hello world";
    }
}

class WeiXin implements IReceiver {

    @Override
    public String getInfo() {
        return "微信消息：hello world";
    }
}

/**
 * Person接收消息的功能
 */
class Person {
    public void receive(IReceiver ireceiver) {
        System.out.println(ireceiver.getInfo());
    }
}
