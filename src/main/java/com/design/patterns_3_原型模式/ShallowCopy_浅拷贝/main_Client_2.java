package com.design.patterns_3_原型模式.ShallowCopy_浅拷贝;

/**
 * 首先定义一封邮件，然后将该邮件发给张三、李四、王五三个人，
 * 由于他们是使用相同的邮件，并且仅有名字不同，
 * 所以使用张三该对象类拷贝李四、王五对象然后更改下名字即可。
 * 程序一直到这里都没有错，但是如果我们需要张三提前30分钟到，即把邮件的内容修改下
 */
public class main_Client_2 {
    public static void main(String[] args) {
        //写封邮件
        Email email = new Email("请参加会议","请与今天12:30到二会议室参加会议...");

        Person person1 =  new Person("张三",email);

        Person person2 =  person1.clone();
        person2.setName("李四");
        Person person3 =  person1.clone();
        person3.setName("王五");

        person1.getEmail().setContent("请与今天12:00到二会议室参加会议...");

        System.out.println(person1.getName() + "的邮件内容是：" + person1.getEmail().getContent());
        System.out.println(person2.getName() + "的邮件内容是：" + person2.getEmail().getContent());
        System.out.println(person3.getName() + "的邮件内容是：" + person3.getEmail().getContent());
    }
}
