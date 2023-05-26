package ru.levshakov;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public int talk(String... x) {
        return x.length;
    }
    public static void main(String[] notes) {
        new B().vo();
    }
}

interface C {
    public void in();
    public void out();
}

class A {
    private void vo() {
        System.out.println("vo");
    }


    public void ab(){};
}

abstract class B extends A implements C{
    public void vo() {
        System.out.println("B");
    }

    public void in() {};
}




