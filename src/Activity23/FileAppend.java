package Activity23;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter filewrite = new FileWriter("Courses.txt",true);
            PrintWriter output = new PrintWriter(filewrite);

            Scanner scan = new Scanner(System.in);
            String name, passW, playerChar;
            int score;
            double winningPer;

            System.out.println("Enter Name");
            name = scan.nextLine();
            System.out.println("Enter Password");
            passW = scan.nextLine();
            System.out.println("Enter Character Name");
            playerChar = scan.nextLine();
            System.out.println("Enter Score");
            score = scan.nextInt();
            System.out.println("Enter Win Percent");
            winningPer = scan.nextInt();

            output.printf("%n%-20s %-20s %6d %23s %15.2f", name,passW,score,playerChar,winningPer);

            filewrite.close();
            output.close();
        } catch (FileNotFoundException e) {
            System.err.println("Your File Wasn't Found.");
        }
    }
}

