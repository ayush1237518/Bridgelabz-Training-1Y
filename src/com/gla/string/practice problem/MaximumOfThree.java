
package com.gla.arrays;

import java.util.Scanner;

public class MaximumOfThree {

    public static int[] takeInput(Scanner sc) {
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }
        return nums;
    }

    public static int findMaximum(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = takeInput(sc);
        int max = findMaximum(numbers);

        System.out.println("Maximum: " + max);
    }
}
