package com.company;

public class Orange<N extends Number> extends Fruit<N>{

    public Orange(N weight) {
        super(weight);
    }
}
