package com.sung.head.first.design.patterns.proxy.o1;

/**
 * Created by sungang on 2017/11/19.
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer player ;

    public GamePlayerProxy(IGamePlayer player){
        this.player = player;
    }


    @Override
    public void login(String username, String password) {
        this.player.login(username,password);
    }

    @Override
    public void killBoss() {
        this.player.killBoss();
    }

    @Override
    public void upgrade() {
        this.player.upgrade();
    }
}
