package com.sung.head.first.design.patterns.adapter.o1;

/**
 * ScoreOperation接口充当抽象目标 抽象成绩操作类：目标接口
 * Created by sungang on 2017/11/6.
 */
public interface ScoreOperation {

    int[] sort(int array[]); //成绩排序

    int search(int array[], int key); //成绩查找
}
