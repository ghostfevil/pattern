package com.ghost.behavior.visitor;

public class Item implements Element{

    private String name;
    public Item(String name)
    {
        this.name=name;
    }

    String getName()
    {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
