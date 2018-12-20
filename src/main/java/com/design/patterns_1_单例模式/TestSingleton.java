package com.design.patterns_1_单例模式;


/**
 * 以懒汉式为例，
 * 这里为了保证线程安全，
 * 使用了双重检查锁定的方式：
 */
public class TestSingleton {
    String name = null;

    private TestSingleton() {
    }

    private static volatile TestSingleton instance = null;

    public static TestSingleton getInstance() {
        if (instance == null) {
            synchronized (TestSingleton.class) {
                if (instance == null) {
                    instance = new TestSingleton();
                }
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("the name is " + name);
    }
}
