package com.design.patterns_1_单例模式;

/**
 * 双重检查锁定
 */
public class Singleton_S {
    private static volatile Singleton_S instance = null;

    private Singleton_S(){
    //do something
    }

    public static Singleton_S getInstance(){
    if(instance == null){
         synchronized(Singleton_S.class){
            if(instance==null){
               instance=new Singleton_S();
            }
         }
    }
    return instance;
    }
}
