package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //1 и 2 задания
//        Changer<?> changer = new Changer(1, "Vasya", 3.7f);
//        changer.change();
//        System.out.println(Arrays.toString(changer.getObj()));
//        System.out.println(changer.setObjToArrayList() instanceof ArrayList);
        Box<Apple> boxWithApples = new Box<>();
        boxWithApples.add(new Apple<>(1));
        boxWithApples.add(new Apple<>(2.0));
        boxWithApples.add(new Apple<>(3.0f));
        Box<Apple> boxWithApples2 = new Box<>(new Apple<>(1.0f));
        List<Orange> oranges = new ArrayList<>();
        oranges.add(new Orange<>(1.0f));
        oranges.add(new Orange<>(2));
        oranges.add(new Orange<>(3.0));
        Box<Orange> boxWithOranges = new Box<>(oranges);
        //boxWithApples.boxToBox(boxWithApples2);
        System.out.println(boxWithApples.getWeight());
        System.out.println(boxWithApples2.getWeight());
        System.out.println(boxWithOranges.getWeight());
        System.out.println(boxWithApples.compare(boxWithOranges));

    }
}
