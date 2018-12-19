package com.design.patterns_1_单例模式;

/**
 *   懒汉式单例（类加载时不初始化）
 *
 *   1）构造函数定义为私有----不能在别的类中来获取该类的对象，只能在类自身中得到自己的对象
 *   2）成员变量为static的，没有初始化----类加载快，但访问类的唯一实例慢，static保证在自身类中获取自身对象
 *   3）公开访问点getInstance： public和synchronized的-----public保证对外公开，同步保证多线程时的正确性（因为类变量不是在加载时初始化的）
 */
public class Singleton_L {
        private static Singleton_L singleton;
        private Singleton_L(){}

        public static synchronized Singleton_L getInstance(){ //静态，同步，公开访问点
            if(singleton==null){
                singleton = new Singleton_L();
            }
        return singleton;
    }
}
