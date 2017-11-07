package com.sung.head.first.design.patterns.prototype.o2;

import java.io.Serializable;

/**
 *
 * 附件类
 *
 * Created by sungang on 2017/11/6.
 */
public class Attachment implements Serializable{

    public void download(){
        System.out.println("下载附件");
    }
}
