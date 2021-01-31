package sda.variable.FLOW;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        //Infants: <1
        //Children: 1-11 years or <7th grade
        //Teens: 12-17 or 7th-12th grade
        //Adults: 18-64
        //Older Adults: 65+
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();



        if (age <= 1) {
            System.out.println("You are an infant");
        } else if (age >= 1 && age <= 11) {
            System.out.println("You are a child");
        } else if (age >=12 && age <=17) {
            System.out.println("You are a teen");
        } else if (age >= 18 && age <=64) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are an older adult");
        }


    }};

