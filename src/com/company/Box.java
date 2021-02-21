package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box<F extends Fruit> {
    private F fruit;
    private List<F> box;
    private double weight;

    public Box() {
        box = new ArrayList<>();
    }

    public Box(List<F> box) {
        this.box = box;
    }

    public Box(F fruit){
        box = new ArrayList<>();
        box.add(fruit);
    }

    public double getWeight(){
        for (F fruit : box) {
            weight += fruit.getWeightFruit().doubleValue();
        }
        return weight;
    }

    public boolean compare(Box box2){
        return getWeight() == box2.getWeight();
    }

    public void add(F fruit){
        box.add(fruit);
    }

    public void boxToBox(Box box2) {
        Iterator<F> iter = box.iterator();
        while (iter.hasNext()) {
            box2.add(iter.next());
        }
        box.clear();
    }
}
