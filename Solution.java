package com.practice.hackerrank.warmup;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(final int n, final int[] arr) {
         Arrays.sort(arr);
         int total = 0;
         for (int i = 0; i < n - 1; i++) {
             System.out.println("i====="+i);
             if (i < n && arr[i] == arr[i + 1]) {
                 total++;
                 i = i + 1;
                 System.out.println("i+1====="+i);
             }
         }
         return total;

     }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) throws IOException {
        //final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        System.out.println("Enter the number of socks: ");
        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        /*final String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            final int arItem = Integer.parseInt(arItems[i]);
            arr[i] = arItem;
            System.out.println("herere");
        }*/

        final int result = sockMerchant(n, arr);
        System.out.println("Result====="+result);


//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }


}

