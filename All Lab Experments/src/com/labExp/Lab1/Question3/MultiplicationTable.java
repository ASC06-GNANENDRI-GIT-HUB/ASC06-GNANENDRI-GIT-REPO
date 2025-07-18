package com.labExp.Lab1.Question3;

public class MultiplicationTable {
    public static void TableFor(int number) {
    System.out.println("Multiplication table using for loop");
    for (int i = 0; i < 10; i++) {
        System.out.println(number + " x " + i + " = " + (number * i));
    }
}

    public static void TableWhile(int number) {
        System.out.println("Multiplication table using while");
        int i = 0;
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
    }

    public static void TableDoWhile(int number) {
        System.out.println("Multiplication table for dowhile");
        int i = 0;
        do {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
        while (i <= 10);
    }

    public static void main(String[] args) {
        int number = 2;
        TableFor(number);
        System.out.println();
        TableDoWhile(number);
        System.out.println();
        TableWhile(number);
    }
}
