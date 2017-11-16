package com.sung.head.first.design.patterns.builder.o2;

import java.util.List;

/**
 *
 * 建造者
 *
 * Created by sungang on 2017/11/16.
 */
public abstract class CarBuilder {

    /**
     * 建造顺序
     * @param sequences
     */
    public abstract void setSequence(List<String> sequences);

    /**
     * 获取建造的汽车
     * @return
     */
    public abstract Car getCarModel();
}
