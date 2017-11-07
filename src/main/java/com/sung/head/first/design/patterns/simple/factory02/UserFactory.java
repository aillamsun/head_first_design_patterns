package com.sung.head.first.design.patterns.simple.factory02;

/**
 * Created by sungang on 2017/11/6.
 */
public class UserFactory {

    public static User getUser(int permission) {
        if (0 == permission) {
            return new Employee();
        } else if (1 == permission) {
            return new Manager();
        } else if (2 == permission) {
            return new Administrator();
        } else {
            return null;
        }
    }
}
