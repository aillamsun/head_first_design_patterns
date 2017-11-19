package com.sung.head.first.design.patterns.proxy.o1;

/**
 * Created by sungang on 2017/11/19.
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(String name){
        this.name = name;
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打boss");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name  + " 又升级了");
    }

    @Override
    public void login(String username, String password) {
        System.out.println("登录名为:" + username + "的用户" + this.name + "登录成功!");
    }
}
