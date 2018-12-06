package com.ghost.structure.composite;

public class Leaf extends Component {

    public Leaf(String name)
    {
        super(name);
    }

    @Override
    void print(int level) {
        for (int i=0;i<level;i++)
        {
            System.out.print("--");
        }
        System.out.println("Leaf:"+name);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }
}
