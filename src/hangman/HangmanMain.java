package hangman;

import java.util.Random;
import java.util.Scanner;

public class HangmanMain {

    public static void main(String[] args){
        String[] words = {"abysmal","chartreuse","chlamydia","accolade","acrimony","esoteric","euphemism","gregarious","harbinger","idyllic","infinitesimal","malinger"};
        Random r = new Random();
        int rand = ((int) (Math.random() * 100) % words.length);
        Scanner input  = new Scanner(System.in);
        boolean play = true;
        int loss = 0;
        char guess = ' ';

        System.out.println("--------------------Welcome to Hangman--------------------");

        while(play){

            String randWord = words[rand];

            while (loss < 5){
                displayWord(randWord, guess);
                System.out.print("Enter a character to guess>>>");
                guess = input.next().charAt(0);
            }

            play = false;

        }
    }
    public static void displayWord(String word, char guess){
        System.out.println("Your word is:");
        for(int i = 0; i < word.length(); i++){
            if(word.indexOf(guess) >= 0){
                System.out.print(guess);
            }
            else{
                System.out.print("*");
            }
        }
        System.out.println("\n");
    }
}
