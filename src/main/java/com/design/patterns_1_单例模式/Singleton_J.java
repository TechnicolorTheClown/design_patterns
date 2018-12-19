package com.design.patterns_1_单例模式;

/**
 * 静态内部类
 */
public class Singleton_J {

    private static class LazyHolder {
        private static final Singleton_J INSTANCE = new Singleton_J();
    }
    private Singleton_J (){}

    public static final Singleton_J getInstance() {
        return LazyHolder.INSTANCE;
    }

}
