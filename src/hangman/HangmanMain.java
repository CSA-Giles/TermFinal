package hangman;

import java.util.Random;
import java.util.Scanner;

public class HangmanMain {

    public static void main(String[] args){
        String[] words = {"abysmal"};
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

                if(randWord.indexOf(guess) == -1){
                    ++loss;
                }
            }

            play = false;

        }
    }
    public static void displayWord(String word, char guess){
        StringBuilder guessedWord = new StringBuilder();
        for(int i = 0; i < word.length(); i++){
                guessedWord.append("*");
        }
        if(word.indexOf(guess) >= 0){
            guessedWord.deleteCharAt(word.indexOf(guess));
            guessedWord.insert(word.indexOf(guess), guess);
            System.out.print(guessedWord);
        }
        System.out.println("\n");
    }
}
