package ru.levshakov;

public class SomeClass {
    int b = this.a;
    int a = 5;
    {
        System.out.print(a);
        System.out.print(b);
    }
    public static void main(String[] args) {
        new SomeClass();
    }
}