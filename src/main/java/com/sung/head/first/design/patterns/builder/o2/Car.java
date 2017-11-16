package com.sung.head.first.design.patterns.builder.o2;

import java.util.ArrayList;
import java.util.List;

/**
 * 汽车 包含组件
 * <p>
 * Created by sungang on 2017/11/16.
 */
public abstract class Car {

    //顺序
    private List<String> sequences = new ArrayList<>();


    /**
     * 轮胎
     */
    protected abstract void tire();

    /**
     * 发动机引擎
     */
    protected abstract void engine();

    /**
     * 喇叭
     */
    protected abstract void speaker();

    /**
     * 显示组件 根据不同组装方式 代表造的是不同类型的汽车
     */
    public void display() {
        for (String sequence : sequences) {
            if (sequence.equals("tire")) {
                this.tire();
            } else if ("engine".equals(sequence)) {
                this.engine();
            } else if ("speaker".equals(sequence)) {
                this.speaker();
            }
        }
    }

    public List<String> getSequences() {
        return sequences;
    }

    public void setSequences(List<String> sequences) {
        this.sequences = sequences;
    }
}
