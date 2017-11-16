package com.sung.head.first.design.patterns.template.o1;

/**
 * Created by sungang on 2017/11/16.
 */
public class Main  {


    public static void main(String[] args) {

        Crawl crawl = new HttpClientCrawlImple();
        crawl.startTask();


        crawl = new OkHttpCrawlImpl();
        crawl.startTask();
    }
}
