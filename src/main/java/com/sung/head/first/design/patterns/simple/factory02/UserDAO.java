package com.sung.head.first.design.patterns.simple.factory02;

/**
 * Created by sungang on 2017/11/6.
 */
public class UserDAO {

    public int findPermission(String userName, String userPassword) {
        if ("zhangsan" == userName && "123456" == userPassword) {
            return 2;
        } else {
            return -1;
        }
    }
}
