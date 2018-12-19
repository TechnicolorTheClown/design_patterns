package com.design.patterns_2_工厂模式.abstractFactory抽象工厂;


import com.design.patterns_2_工厂模式.abstractFactory抽象工厂.Impl.AirconditionA;
import com.design.patterns_2_工厂模式.abstractFactory抽象工厂.Impl.EngineA;

//为宝马320系列生产配件
public class FactoryBMW320 implements AbstractFactory {

    @Override
    public Engine createEngine() {
        return new EngineA();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
