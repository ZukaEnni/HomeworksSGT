package sda.variable.FLOW;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        a = scanner.nextInt();
        System.out.println("enter second number");
        b = scanner.nextInt();
        System.out.println("enter third number");
        c = scanner.nextInt();

        // > is used to check variable is greater,
        // < is used to check is less,
        // >= greater or equal,
        // <= less or equal
        int biggestInteger = Integer.MAX_VALUE;
        int smallestInteger = Integer.MIN_VALUE;

        if (a < biggestInteger) {
            smallestInteger = a;
        }
        if (a < b) {
            if (a < c)
                smallestInteger = a;
        }

        if (b < a) {
            if(b < c){

                smallestInteger = b;
            } else {
            }
            if (c < a) {
                if (c < b) {
                    smallestInteger = c;
                }
            }
        }
        System.out.println("Smallest number is: " + smallestInteger);
    }

}


