package com.design.patterns_2_工厂模式.simpleFactory简单工厂;

/**
 * 工厂类
 */
public class Factory {
    public BMW createBMW(int type) {
        switch (type) {

            case 320:
                return new BMW320();

            case 523:
                return new BMW523();

            default:
                break;
        }
        return null;
    }
}
