package com.design.patterns_2_工厂模式.factoryMethod工厂方法;

/**
 * 工厂类
 */
public class FactoryBMW320 implements FactoryBMW{

    @Override
    public BMW320 createBMW() {
        return new BMW320();
    }
}
