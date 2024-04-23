package ols2307.exceptionhandling;

import java.util.Scanner;

public class ArrayIndexException {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 4: ");
        int size = scanner.nextInt();
        try {
            for (int i = 0; i <= size; i++) {
                nums[i] = (i + 1) * 10;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Error occured! Please contact support!");
        }

        try {
            System.out.println("The content of array is:");
            for (int i = 0; i <= size; i++) {
                System.out.println(nums[i]);
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Error occured! Please contact support!");
        }
        System.out.println("Aal is well!");
        scanner.close();
    }
}
