package com.practice.hackerrank.warmup;

import java.io.IOException;
import java.util.Scanner;

public class LeftRotation {

    static int[] rotLeft(final int[] arr, final int d) {
        final int n = arr.length;

        // Create new array for rotated elements:
        final int[] rotated = new int[n];

        // Copy segments of shifted elements to rotated array:
        System.arraycopy(arr, d, rotated, 0, n - d);
        System.arraycopy(arr, 0, rotated, n - d, d);

        return rotated;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) throws IOException {

        System.out.println("Enter size and number of rotation:");
        final String[] nd = scanner.nextLine().split(" ");
        final int n = Integer.parseInt(nd[0]);
        final int d = Integer.parseInt(nd[1]);

        final int[] a = new int[n];
        System.out.println("Enter values:");
        final String[] aItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            final int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        final int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.print("");
            }
        }

        scanner.close();
    }

}
