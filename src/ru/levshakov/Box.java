package ru.levshakov;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    public ArrayList<T> content = new ArrayList<>();

    public int getWeight() {
        System.out.println(content.size());
        System.out.println(T.WEIGHT);

        return content.size()*T.WEIGHT;
    }
}
