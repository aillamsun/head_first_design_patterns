package com.sung.head.first.design.patterns.prototype.o1;

/**
 * Created by sungang on 2017/11/6.
 */
public class Client {


    public static void main(String[] args) throws Exception{
        Email email, copyEmail;

        email = new Email();

        copyEmail = (Email) email.clone();

        System.out.println("email==copyEmail?");
        System.out.println(email == copyEmail);

        System.out.println("email.getAttachment==copyEmail.getAttachment?");
        System.out.println(email.getAttachment() == copyEmail.getAttachment());
    }
}
