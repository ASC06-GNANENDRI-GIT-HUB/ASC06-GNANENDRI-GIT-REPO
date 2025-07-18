package com.labExp.Lab1.Question6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStore {
    int arr[] = new int[10];

    void AcceptElements(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
    }
    //Display using for loop
    void Fordisplayinteger(){
        System.out.println("Display integer using For loop:");
        for(int i = 0; i<10; i++){
            System.out.println(arr[i]);
        }
    }
    // display using while loop
    void WhileDisplayinteger(){
        int i=0;
        System.out.println("Display of integers using while loop:" );
        while(i<10){
            System.out.println(arr[i]);
            i++;
        }
    }
    //sort the array
    void ArraySort() {
        Arrays.sort(arr);
        {
            System.out.println("sorted array:" + Arrays.toString(arr));
        }
    }
    // count the number of occurance
    int countoccurance ( int num){
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == num)
                count++;
        }
        return count;
    }
    // to insert number
    void InsertArr ( int num, int pos){
        if (pos < 0 || pos > 10) {
            System.out.println("Invalid Position");
            return;
        }
        int[] newArr = new int[11];
        for (int i = 0,  j = 0; i < 11; i++) {
            if (i == pos) {
                newArr[i] = num;
            } else {
                newArr[i] = arr[j++];
            }
        }
        System.out.println("Array after insertion:" + Arrays.toString(newArr));
    }
    public static void main (String[]args){
        ArrayStore store = new ArrayStore();
        Scanner sc = new Scanner(System.in);

        store.AcceptElements();
        store.Fordisplayinteger();
        store.WhileDisplayinteger();
        store.ArraySort();

        System.out.println("Enter number of count");
        int num = sc.nextInt();
        System.out.println(num + " occurs " + store.countoccurance(num) + " times ");

        System.out.println("Enter number to insert: ");
        int insertNum = sc.nextInt();
        System.out.println("Enter position (0-10):");
        int pos = sc.nextInt();
        store.InsertArr(insertNum, pos);
    }
}
