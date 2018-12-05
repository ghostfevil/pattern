package com.ghost.structure.proxy;

public class Purchasing implements IShop {

    private IShop mShop;

    public Purchasing(IShop shop)
    {
        this.mShop=shop;
    }

    @Override
    public void buy() {
        mShop.buy();
    }
}
