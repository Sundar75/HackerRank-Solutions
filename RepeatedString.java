package com.practice.hackerrank.warmup;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {
    static long repeatedString(final String s, final long n) {
        final long remainder = n%s.length();
        final long quotient = n/s.length();
        long count = 0;
        long totalCount = 0;
        if(s.length()==1 && s.equalsIgnoreCase("a")) {
            totalCount = n;
        }else {
        for (int i=0;i<s.length();i++) {
        if(s.charAt(i)=='a') {
            count++;
        }
        }
        totalCount += quotient * count;
        for (int j=0;j<remainder;j++) {
            if(s.charAt(j)=='a') {
                totalCount++;
            }
        }}
        return totalCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) throws IOException {


        System.out.println("Enter the String :");

        final String s = scanner.nextLine();
        System.out.println("Enter the number :");

        final long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final long result = repeatedString(s, n);


        scanner.close();
        System.out.println("Result======"+result);
    }
}
