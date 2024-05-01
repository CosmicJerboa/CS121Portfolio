package Project1;

import java.util.Random;
import java.util.Scanner;

public class CharacterBattle {
    public static void main(String[] args) {
        String playerOne, playerTwo, moveOne, moveTwo = "";
        int powerOne, powerTwo, hpOne, hpTwo, atkSpdOne, atkSpdTwo,
                playerWinOne = 0, playerWinTwo = 0;
        int roundLimit = 0;
        Scanner scan = new Scanner(System.in);
        boolean isEven = true;


        while (isEven) {
            System.out.println("Enter Odd Number Of Rounds");
            roundLimit = scan.nextInt();
            scan.skip("\\R");

            isEven = roundLimit % 2 == 0;
            if (isEven) {
                System.out.println("INVALID INPUT IDIOT TRY AGAIN");
            }
        }


        Random rand = new Random();

        for (int i = 0; i < roundLimit; i++) {
            System.out.println("Player One Give Me Your Info NOW");

            System.out.println("ENTER NAME:");
            playerOne = scan.nextLine();

            System.out.println("HP");
            hpOne = scan.nextInt();
            scan.skip("\\R");

            System.out.println("MOVE NAME:");
            moveOne = scan.nextLine();

            System.out.println("GIMMIE DAH POWER");
            powerOne = scan.nextInt();
            scan.skip("\\R");

            System.out.println("ATACK SPEEEEEEEEED");
            atkSpdOne = scan.nextInt();
            scan.skip("\\R");


            System.out.println("Player Two Give Me Your Info NOW");

            System.out.println("ENTER NAME:");
            playerTwo = scan.nextLine();

            System.out.println("HP");
            hpTwo = scan.nextInt();
            scan.skip("\\R");

            System.out.println("MOVE NAME:");
            moveTwo = scan.nextLine();

            System.out.println("GIMMIE DAH POWER");
            powerTwo = scan.nextInt();
            scan.skip("\\R");

            System.out.println("ATACK SPEEEEEEEEED");
            atkSpdTwo = scan.nextInt();
            scan.skip("\\R");


            if (atkSpdOne > atkSpdTwo) {
                while (true) {
                    hpTwo = hpTwo - powerOne;
                    if (hpTwo <= 0) {
                        playerWinOne += 1;
                        System.out.println("The winner of this round is: " + playerOne);
                        break;
                    }
                    hpOne = hpOne - powerTwo;
                    if (hpOne <= 0) {
                        playerWinTwo += 1;
                        System.out.println("The winner of this round is: " + playerTwo);
                        break;
                    }
                }
            } else if (atkSpdOne < atkSpdTwo) {
                while (true) {
                    hpOne = hpOne - powerTwo;
                    if (hpOne <= 0) {
                        playerWinTwo += 1;
                        System.out.println("The winner of this round is: " + playerTwo);
                        break;
                    }
                    hpTwo = hpTwo - powerOne;
                    if (hpTwo <= 0) {
                        playerWinOne += 1;
                        System.out.println("The winner of this round is: " + playerOne);
                        break;
                    }
                }
            } else if (rand.nextInt(2) == 1) {
                while (true) {
                    hpTwo = hpTwo - powerOne;
                    if (hpTwo <= 0) {
                        playerWinOne += 1;
                        System.out.println("The winner of this round is: " + playerOne);
                        break;
                    }
                    hpOne = hpOne - powerTwo;
                    if (hpOne <= 0) {
                        playerWinTwo += 1;
                        System.out.println("The winner of this round is: " + playerTwo);
                        break;
                    }
                }

            } else {
                while (true) {
                    hpOne = hpOne - powerTwo;
                    if (hpOne <= 0) {
                        playerWinTwo += 1;
                        System.out.println("The winner of this round is: " + playerTwo);
                        break;
                    }
                    hpTwo = hpTwo - powerOne;
                    if (hpTwo <= 0) {
                        playerWinOne += 1;
                        System.out.println("The winner of this round is: " + playerOne);
                        break;
                    }
                }

            }
        }
        System.out.println("Player One Wins: " + playerWinOne + "\nPlayer Two Wins: " + playerWinTwo);
        if (playerWinOne > playerWinTwo) {
            System.out.println("Player One Is Better At Picking Higher Numbers");
        } else {
            System.out.println("Player Two Is Better At Picking Higher Numbers");
        }
    }
}
