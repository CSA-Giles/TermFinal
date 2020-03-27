package hangman;

import java.util.Scanner;

public class HangmanMain {

    public static void main(String[] args){
        String[] words = {"chump","loser","korn","corn","pain","hatred","acrimony","antidote","baroque","brogue","cloying","clot","junket"};
        int rand = ((int) (Math.random() * 100) % words.length);
        Scanner input  = new Scanner(System.in);
        boolean play = true;
        boolean end = false;
        int loss = 0;
        char guess = ' ';

        String blankWord = "";
        for(int i = 0; i < words[rand].length(); i++){
            blankWord += "*";
        }

        GetWord yourWord = new GetWord();

        System.out.println("--------------------Welcome to Hangman--------------------");

        while(play){
            String randWord = words[rand];
            yourWord.setWords(randWord);

            StringBuilder guessedWord = new StringBuilder(blankWord);
            System.out.println(blankWord);
            while (!end){
                System.out.print("Enter a character to guess>>>");
                guess = input.next().charAt(0);
                if(yourWord.getWords().indexOf(guess) >= 0){
                    guessedWord.setCharAt(yourWord.getWords().indexOf(guess), guess);
                    System.out.println(guessedWord);
                }
                else if(yourWord.getWords().indexOf(guess) == -1){
                    System.out.print("Wrong!\n");
                    loss++;
                    GUI.Graphics(loss);
                }

                String finalWord = guessedWord.toString();
                if(finalWord.equals(yourWord.getWords())){
                    System.out.println("You won! You had " + loss + " incorrect guess(es).");
                    WriteText.writeString("Win, Incorrect: " + loss );
                    WriteText.saveAndClose();
                    end = true;
                    play = false;
                }
                else if(loss >= 6){
                    System.out.println("YOU LOST. The word was: "  + words[rand]);
                    WriteText.writeString("Loss");
                    WriteText.saveAndClose();
                    end = true;
                    play = false;
            }


            }

        }
    }
}
