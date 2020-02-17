package com.practice.hackerrank.warmup;

import java.io.IOException;
import java.util.Scanner;

public class CountingValley {

    // Complete the countingValleys function below.
    static int countingValleys(final int n, final String s) {
        int valleyCount =0;
        int level = 0;
        boolean belowSea = false;

        if(s.length() >= 2 && s.length() <= 1000000) {
            for(int i= 0; i < s.length(); i++){
                final Character slope = s.charAt(i);
                if(null !=slope.toString() && slope.toString().equalsIgnoreCase("U")){
                    level++;
                }else{
                    level--;
                }
                if(!belowSea && level < 0){
                    valleyCount++;
                    belowSea = true;
                }
                if(level >= 0) {
                    belowSea = false;
                }
            }
        }
        return valleyCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) throws IOException {
        //final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        System.out.println("Enter the number :");
        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Enter the String :");
        final String s = scanner.nextLine();

        final int result = countingValleys(n, s);
        System.out.println("Result======"+result);

        scanner.close();
    }
}

