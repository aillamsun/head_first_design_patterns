package com.sung.head.first.design.patterns.simple.factory02;

/**
 * Created by sungang on 2017/11/6.
 */
public abstract class User {

    public void sameOperation() {
        System.out.println("sameOperation");
    }

    public abstract void diffOperation();
}
