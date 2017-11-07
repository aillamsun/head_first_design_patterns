package com.sung.head.first.design.patterns.simple.factory02;

/**
 * Created by sungang on 2017/11/6.
 */
public class ClientMain {

    public static void main(String[] args) {
        User user;
        UserDAO userDao = new UserDAO();
        int permission = userDao.findPermission("zhangsan", "123456");
        user = UserFactory.getUser(permission);
        user.sameOperation();
        user.diffOperation();
    }
}
