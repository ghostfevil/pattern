package com.ghost.creator.prototype;

/****
 *
 *
 * 个人订单信息
 *
 */

public class PersonOrder implements OrderApi {

    private String customerName;
    private String productId;

    private int orderProductNum=0;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public int getOrderProductNum() {
        return orderProductNum;
    }

    @Override
    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum=orderProductNum;
    }

    @Override
    public OrderApi clone() {

        PersonOrder order=new PersonOrder();
        order.setCustomerName(this.customerName);
        order.setProductId(this.productId);
        order.setOrderProductNum(this.orderProductNum);

        return order;
    }
}
