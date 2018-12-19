package com.design.patterns_2_工厂模式.abstractFactory抽象工厂;


import com.design.patterns_2_工厂模式.abstractFactory抽象工厂.Impl.AirconditionB;
import com.design.patterns_2_工厂模式.abstractFactory抽象工厂.Impl.EngineB;

//宝马523系列
public class FactoryBMW523 implements AbstractFactory {

    @Override
    public Engine createEngine() {
        return new EngineB();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
