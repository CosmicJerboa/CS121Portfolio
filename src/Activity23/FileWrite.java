package Activity23;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("Courses.txt");

        PrintWriter output = new PrintWriter(outputFile);

        output.printf("%-20s %-20s %-17s %-20s %-20s", "Name ","Password ","Score ","Player Character ","Winning Percent");

        String name, passW, playerChar;
        int score;
        double winningPer;
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter Name");
            name = scan.nextLine();
            System.out.println("Enter Password");
            passW = scan.nextLine();
            System.out.println("Enter Character Name");
            playerChar = scan.nextLine();
            System.out.println("Enter Score");
            score = Integer.parseInt(scan.nextLine());
            System.out.println("Enter Win Percent");
            winningPer = Double.parseDouble(scan.nextLine());
            output.printf("%n%-20s %-20s %6d %23s %15.2f", name,passW,score,playerChar,winningPer);
        }
        output.close();
        scan.close();

    }
}
