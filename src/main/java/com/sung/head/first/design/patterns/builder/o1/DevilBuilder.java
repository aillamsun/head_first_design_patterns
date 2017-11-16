package com.sung.head.first.design.patterns.builder.o1;

/**
 * Created by sungang on 2017/11/6.
 */
public class DevilBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("妖");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }

    @Override
    public boolean isBareheaded() {
        return true;
    }
}
