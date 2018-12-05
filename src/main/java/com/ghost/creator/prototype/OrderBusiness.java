package com.ghost.creator.prototype;

public class OrderBusiness {


    public void saveOrder(OrderApi order)
    {

        while (order.getOrderProductNum()>1000)
        {
            OrderApi newOrder=order.clone();
            newOrder.setOrderProductNum(1000);

            order.setOrderProductNum(order.getOrderProductNum()-1000);

            System.out.println("订单已拆分");

        }


    }


}
