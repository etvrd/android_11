package com.company;

public abstract class Fruit<N extends Number> {
    private N weight;

    public Fruit(N weight) {
        this.weight = weight;
    }

    public N getWeightFruit() {
        return weight;
    }
}
