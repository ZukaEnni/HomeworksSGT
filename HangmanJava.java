package sda.variable.HW;

import java.util.ArrayList;
import java.util.Scanner;

public class HangmanJava {

    static public void guess(String word, int life) {
        char[] filler = new char[word.length()];
        int i = 0;
        while (i < word.length()) {
            filler[i] = '-';
            if (word.charAt(i) == ' ') {
                filler[i] = ' ';
            }
            i++;
        }
        System.out.println(filler);
        System.out.println("Life remaining " + life);
        ArrayList<Character> l=new ArrayList<Character>();

        Scanner s = new Scanner(System.in); //to read characters
        while (life > 0) {
            char x = s.next().charAt(0); // character input by user
            if(l.contains(x)){
                System.out.println("Already entered");
                continue;                  // while loop continues
            }
            l.add(x);

            if (word.contains(x + "")) {
                for (int y = 0; y < word.length(); y++) {
                    if (word.charAt(y) == x) {
                        filler[y] = x;
                    }
                }
            } else {
                life--;                      // life decreases if chararacter entereed isnt  in word
            }

            if (word.equals(String.valueOf(filler))) {    //checking if filler equals word
                System.out.println(filler);
                System.out.println("You won!!!");
                break;
            }
            System.out.println(filler);
            System.out.println("Life remaining " + life);
        }
        if(life == 0) {
            System.out.println("You lose");
        }
    }
    public static void main(String[] args) {
        String word = "welcome to java"; //word to be guessed
        int life = 5; //life of number of chances
        guess(word, life);
    }
}
