package GettingStarted;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int freq = getFrequency(n, d);
        display(freq);
    }

    private static void display(int freq) {
        System.out.println(freq);
    }

    private static int getFrequency(int n, int d) {
        int count = 0;
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            if (dig== d) {
                count++;
            }
        }
        return count;
    }
}
