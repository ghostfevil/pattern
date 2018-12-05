package com.ghost.creator.builder;


/****
 * 抽象建造者类（声明构建负责对象过程中具体使用到的方法）
 */
public abstract class Builder {


    /****
     * 构建CPU的抽象方法
     * @param cpu
     */
    public abstract void buildCpu(String cpu);

    /*****
     * 构建主板的抽象方法
     * @param mainboard
     */
    public abstract void buildMainboard(String mainboard);

    /****
     * 构建内存的抽象方法
     * @param ram
     */
    public abstract void buildRam(String ram);

    /***
     * 构建的抽象方法
     * @return
     */
    public abstract Computer create();




}
