package hangman;

public class GUI {

    public static void Graphics(int count){

        if(count == 1){
            System.out.println("     ______");
            System.out.println("    |     |");
            System.out.println("    |     O");
            System.out.println("    |      ");
            System.out.println("    |      ");
            System.out.println("    |      ");
            System.out.println("-----------");
        }
        else if(count == 2){
            System.out.println("     ______");
            System.out.println("    |     |");
            System.out.println("    |     O");
            System.out.println("    |     |");
            System.out.println("    |      ");
            System.out.println("    |      ");
            System.out.println("-----------");
        }
        else if(count == 3){
            System.out.println("     ______");
            System.out.println("    |     |");
            System.out.println("    |     O");
            System.out.println("    |    /|");
            System.out.println("    |      ");
            System.out.println("    |      ");
            System.out.println("-----------");
        }
        else if(count == 4){
            System.out.println("     ______");
            System.out.println("    |     |");
            System.out.println("    |     O");
            System.out.println("    |    /|\\");
            System.out.println("    |      ");
            System.out.println("    |      ");
            System.out.println("-----------");
        }
        else if(count == 5){
            System.out.println("     ______");
            System.out.println("    |     |");
            System.out.println("    |     O");
            System.out.println("    |    /|\\");
            System.out.println("    |    / ");
            System.out.println("    |      ");
            System.out.println("-----------");
        }
        else if(count == 6){
            System.out.println("     ______");
            System.out.println("    |     |");
            System.out.println("    |     O");
            System.out.println("    |    /|\\");
            System.out.println("    |    / \\");
            System.out.println("    |      ");
            System.out.println("-----------");
        }
    }
}
