package Activity23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File fileOne = new File("Courses.txt");
        try {
            Scanner console = new Scanner(fileOne);

            String header = console.nextLine();
            System.out.printf("%s",header);

            while(console.hasNextLine()) {
                String name = console.next();
                String passW = console.next();
                int score = Integer.parseInt(console.next());
                String playerChar = console.next();
                double winningPer = Double.parseDouble(console.next());

                System.out.printf("%n%-20s %-20s %6d %23s %15.2f", name,passW,score,playerChar,winningPer);
            }
            console.close();
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
