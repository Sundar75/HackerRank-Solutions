package com.practice.hackerrank.warmup;

import java.io.IOException;
import java.util.Scanner;

public class Jumpingclouds {
    static int jumpingOnClouds(final int[] c) {
        int jumps = 0;
        int i = 0;
        final int n = c.length;
        while(i < n-3) //goes through all clouds up until the last jump
        {
            i += (c[i+2] == 0) ? 2 : 1;
            jumps++;
        }

        jumps++;//This is the last jump that will be either a 1 or 2

       return jumps;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) throws IOException {
        /*
         * final BufferedWriter bufferedWriter = new BufferedWriter(new
         * FileWriter(System.getenv("OUTPUT_PATH")));
         */
        System.out.println("Enter the number :");
        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final int[] c = new int[n];

        System.out.println("Enter the Values :");

        final String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            final int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        final int result = jumpingOnClouds(c);

        /*
         * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
         * bufferedWriter.close();
         */
        System.out.println("Result==============" + result);
        scanner.close();
    }

}
