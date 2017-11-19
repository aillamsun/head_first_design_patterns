package com.sung.head.first.design.patterns.proxy.o1;

import java.lang.reflect.Proxy;

/**
 * Created by sungang on 2017/11/19.
 */
public class Main2 {

    public static void main(String[] args) {

        //主题
        IGamePlayer player = new GamePlayer("张三");
        //handler
        GameHandler handler = new GameHandler(player);
        ClassLoader classLoader = player.getClass().getClassLoader();

        //定义主题代理
//        IGamePlayer proxy = DynamicProxy.newProxyInstance(classLoader,player.getClass().getInterfaces(),handler);

//        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, player.getClass().getInterfaces(), handler);

        IGamePlayer proxy =  (IGamePlayer) handler.getProxy();

        proxy.login("zhangsna", "111111");
        proxy.killBoss();
        proxy.upgrade();
    }
}
