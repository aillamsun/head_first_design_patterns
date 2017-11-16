package com.sung.head.first.design.patterns.builder.o1;

/**
 * 指挥者类ActorController定义了construct()方法，
 * 该方法拥有一个抽象建造者ActorBuilder类型的参数，在该方法内部实现了游戏角色对象的逐步构建
 * Created by sungang on 2017/11/6.
 */
public class ActorController {


    //逐步构建复杂产品对象
    public Actor construct(ActorBuilder builder) {

        builder.buildType();
        builder.buildSex();
        builder.buildFace();
        builder.buildCostume();

        //通过钩子方法来控制产品的构建
        if (!builder.isBareheaded()){
            builder.buildHairstyle();
        }
        Actor actor = builder.createActor();

        return actor;
    }
}
