package com.sung.head.first.design.patterns.proxy.o1;

/**
 * Created by sungang on 2017/11/19.
 */
public class Main {


    public static void main(String[] args) {
//        IGamePlayer player = new GamePlayer("张三");
//        player.login("zhangsna","111111");
//        player.killBoss();
//        player.upgrade();


        IGamePlayer player = new GamePlayer("张三");
        GamePlayerProxy playerProxy = new GamePlayerProxy(player);
        playerProxy.login("zhangsna", "111111");
        playerProxy.killBoss();
        playerProxy.upgrade();
    }
}
