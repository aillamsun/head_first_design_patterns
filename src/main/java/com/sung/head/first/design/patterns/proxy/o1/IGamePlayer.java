package com.sung.head.first.design.patterns.proxy.o1;

/**
 *
 *
 * 游戏者接口
 * Created by sungang on 2017/11/19.
 */
public interface IGamePlayer {

    /**
     * 登录游戏
     */
    void login(String username,String password);

    /**
     * 杀boss
     */
    void killBoss();

    /**
     * 升级
     */
    void upgrade();


}
