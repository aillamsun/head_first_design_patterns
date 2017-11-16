package com.sung.head.first.design.patterns.template.o1;

/**
 * Created by sungang on 2017/11/16.
 */
public class HttpClientCrawlImple extends Crawl {


    @Override
    void start() {
        System.out.println("------ httpclient start ------");
    }

    @Override
    void run() {
        System.out.println("------ httpclient run ------");
    }


    @Override
    void stop() {
        System.out.println("------ httpclient stop ------");
    }
}
