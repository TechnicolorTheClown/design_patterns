package com.design.patterns_2_工厂模式.factoryMethod工厂方法;

public class FactoryBMW523 implements FactoryBMW{
    @Override
    public BMW523 createBMW() {
        return new BMW523();
    }
}
