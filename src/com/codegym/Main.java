package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Element is " + i + " : " + "\t");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int j = 0; j < array.length ; j++) {
            if (min > array[j]) {
                min = array[j];
            }
        }
        System.out.println("Min of array: " + min);
    }
}
