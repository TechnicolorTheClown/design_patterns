package com.design.patterns_2_工厂模式.simpleFactory简单工厂;

/**
 * 客户
 */
public class main_Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }
}
