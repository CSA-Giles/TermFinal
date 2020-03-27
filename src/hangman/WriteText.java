package hangman;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class WriteText {

    private static final String DATA_FILE = "wins.txt";
    private static Scanner in;
    private static BufferedWriter out;

    public static void writeString(String s) {
        if (out == null) {
            try {
                out = new BufferedWriter(new FileWriter(DATA_FILE));
            }
            catch (Exception e) {
                System.err.println("Error: " + e);
            }
        }

        try {
            out.write(s);
            out.newLine();
        }
        catch (Exception e) {
            System.err.println("Error: " + e);
            e.printStackTrace();
        }

    }

    public static void saveAndClose() {
        if (in != null) {
            try {
                in.close();
                in = null;
            }
            catch (Exception e) {
                System.err.println("Error: " + e);
            }
        }
        if (out != null) {
            try {
                out.close();
                out = null;
            }
            catch (Exception e) {
                System.err.println("Error: " + e);
            }
        }
    }
}
