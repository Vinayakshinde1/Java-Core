package com.learning.core.day4session2;
import java.util.Scanner;

public class D04P10_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        // Input array
        int[] array = new int[n];
        System.out.println("Enter the elements separated by space:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to search:");
        int target = scanner.nextInt();

        boolean found = linearSearch(array, target);

        if (found) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is not Present");
        }

        scanner.close();
    }

    // Linear search function
    public static boolean linearSearch(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true; // Element found
            }
        }
        return false; // Element not found
    }
}