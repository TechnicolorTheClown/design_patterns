package com.design.patterns_2_工厂模式.abstractFactory抽象工厂;

public interface AbstractFactory {
    //制造发动机
    public Engine createEngine();
    //制造空调
    public Aircondition createAircondition();
}
