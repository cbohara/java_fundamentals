package com.pluralsight.getorganized;

public class Main {

    public static void main(String[] args) {
        int myVar;
        myVar = 50;
        // 50
        System.out.println(myVar);

        int anotherVar;
        anotherVar = 100;
        // 100
        System.out.println(anotherVar);

        myVar = anotherVar;
        // 100
        System.out.println(myVar);

        anotherVar = 200;
        // 200
        System.out.println(anotherVar);

        // 100
        System.out.println(myVar);
    }
}
