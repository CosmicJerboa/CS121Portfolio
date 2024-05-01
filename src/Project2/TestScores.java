package Project2;

import java.util.Random;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        final int SIZE = rand.nextInt(3, 11);

        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];

        System.out.println("Enter your " + SIZE + " test scores.");

        for (int i = 1; i <= testScores.length; i++) {
            System.out.println("Enter test " + i + " score");
            testScores[i - 1] = Integer.parseInt(scan.nextLine());
        }

        for (int i = 0; i < letterGrades.length; i++) {
            letterGrades[i] = getLetterGrade(testScores[i]);
        }

        printGrades(testScores, letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores, SIZE);

        scan.close();

    }

    static char getLetterGrade(int testScore) {
        char letterGrade;

        if (testScore >= 90 && testScore <= 100) {
            letterGrade = 'A';
        } else if (testScore >= 80 && testScore <= 89) {
            letterGrade = 'B';
        } else if (testScore >= 70 && testScore <= 79) {
            letterGrade = 'C';
        } else if (testScore >= 60 && testScore <= 69) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        return letterGrade;
    }

    static void printGrades(int[] testScores, char[] letterGrades) {
        System.out.printf("%s %10s \n", "Score", "Grade");
        for (int i = 0; i < testScores.length; i++) {
            System.out.printf("%-3d %8c \n", testScores[i], letterGrades[i]);
        }
    }

    static void printHighestScore(int[] testScores) {
        int temp = 0;
        for (int i = 0; i < testScores.length; i++) {
            if (testScores[i] > temp) {
                temp = testScores[i];
            }
        }
        System.out.println("Highest score: " + temp);
    }

    static void printLowestScore(int[] testScores) {
        int temp = 99999;
        for (int i = 0; i < testScores.length; i++) {
            if (testScores[i] < temp) {
                temp = testScores[i];
            }
        }
        System.out.println("Lowest score: " + temp);
    }

    static void printAverageScore(int[] testScores, int length) {
        double temp = 0;
        for (int i = 0; i < testScores.length; i++) {
            temp += testScores[i];
        }
        temp = temp / length;
        System.out.println("Average score: " + temp);
    }

}
