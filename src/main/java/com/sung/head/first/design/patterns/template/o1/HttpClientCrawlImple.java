package com.sung.head.first.design.patterns.template.o1;

/**
 * Created by sungang on 2017/11/16.
 */
public class CrawlImpl extends Crawl {


    @Override
    void start() {
        System.out.println("------ one start ------");
    }

    @Override
    void run() {
        System.out.println("------ one run ------");
    }


    @Override
    void stop() {
        System.out.println("------ one stop ------");
    }
}
