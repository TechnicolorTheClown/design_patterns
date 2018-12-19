package com.design.patterns_1_单例模式;


/**
 *   饿汉式单例（在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快）
 *
 * 1）私有构造函数
 * 2）静态私有成员--在类加载时已初始化
 * 3）公开访问点getInstance-----不需要同步，因为在类加载时已经初始化完毕，也不需要判断null，直接返回
 */
public class Singleton_E {
    private Singleton_E() {}
    private static Singleton_E single=null;
    //静态工厂方法
    public static Singleton_E getInstance() {
        if (single == null) {
            single = new Singleton_E();
        }
        return single;
    }
}
