package com.sung.head.first.design.patterns.template.o1;

/**
 * Created by sungang on 2017/11/16.
 */
public class OkHttpCrawlImpl extends Crawl{


    @Override
    void start() {
        System.out.println("------ okhttp start ------");
    }

    @Override
    void run() {
        System.out.println("------ okhttp run ------");
    }


    @Override
    void stop() {
        System.out.println("------ okhttp stop ------");
    }
}
