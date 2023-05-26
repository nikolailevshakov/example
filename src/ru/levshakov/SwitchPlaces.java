package ru.levshakov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwitchPlaces<A> {
    public A[] array;

    public SwitchPlaces(A[] a) {
        this.array = a;
    }

    public void switchTwo(int index1, int index2) {
        A temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public ArrayList<A> transform() {
        ArrayList<A> arraylist= new ArrayList<A>(Arrays.asList(this.array));
        return arraylist;
    }

    public void print() {
        for (A item: this.array) {
            System.out.println(item);
        }
    }

}
