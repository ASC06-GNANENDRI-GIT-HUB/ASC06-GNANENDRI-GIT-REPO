package com.labExp.Lab2.Question3;

public class LargestNumberApp {public static int largest(int a, int b, int c){
    return Math.max(a, Math.max(b,c));
}
    public static void main(String[] args){
        int num1 = 45;
        int num2 = 89;
        int num3 = 32;
        int largestNumber = largest(num1, num2, num3);
        System.out.println("The largest number is: " + largestNumber);
    }
}
