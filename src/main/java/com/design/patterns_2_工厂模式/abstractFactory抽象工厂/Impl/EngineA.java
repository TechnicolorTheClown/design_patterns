package com.design.patterns_2_工厂模式.abstractFactory抽象工厂.Impl;


import com.design.patterns_2_工厂模式.abstractFactory抽象工厂.Engine;

public class EngineA implements Engine {
    public EngineA(){
        System.out.println("制造-->EngineA");
    }
}
