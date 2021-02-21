package com.company;

public class Apple<N extends Number> extends Fruit<N>{

    public Apple(N weight) {
        super(weight);
    }
}
