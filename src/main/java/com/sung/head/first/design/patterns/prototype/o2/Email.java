package com.sung.head.first.design.patterns.prototype.o2;

import java.io.*;

/**
 * Created by sungang on 2017/11/6.
 */
public class Email implements Serializable {


    private Attachment attachment;

    public Email() {
        this.attachment = new Attachment();
    }


    protected Object deepClone() throws Exception {
        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (ois.readObject());
    }


    public Attachment getAttachment() {
        return this.attachment;
    }

    public void display() {
        System.out.println("查看邮件");
    }
}
