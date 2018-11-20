package com.ghost.creator.prototype;


public interface OrderApi {



    public int getOrderProductNum();

    public void setOrderProductNum(int orderProductNum);

    /****
     *
     * clone
     *
     */

    public OrderApi clone();

}
