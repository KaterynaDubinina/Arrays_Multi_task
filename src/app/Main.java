package app;

import java.util.Scanner;

public class Main {
    private static int count;

    public static void main (String[] args) {

        int[][] lotteryTicket = {
                {14, 30, 43, 51},
                {15, 22, 40, 56},
                {24, 32, 59, 74},
                {12, 27, 44, 52}
        };

        System.out.println("\nThis is a lottery ticket:\n");

        for (int i = 0; i < lotteryTicket.length; i++) {
            for (int k = 0; k < lotteryTicket[i].length; k++) {
                System.out.print("  " + lotteryTicket[i][k] + "  ");
            }
            System.out.println("\n");
        }

        //Визначаємо переможця.
        //Варіант 1
        int winner = 22;

        // Варіант 2
        // Переможне число згенерується випадковим чином
        // У заданому діапазоні.

        // int min = 1;
        // int max = 16;
        // int diff = max - min;
        // Random random = new Random();
        // int winner = random.nextInt(diff + 1);
        // winner += min;

        Scanner lotteryScanner = new Scanner(System.in);
        System.out.println("Select one number from the ones presented above:");
        int search = lotteryScanner.nextInt();

        for (int[] values : lotteryTicket) {
            for (int v : values) {
                if (v == search) {
                    count++;
                }
            }
        }

        if (count > 0 && search == winner)
            System.out.println("You won! Congratulations!");
        else if (count > 0)
            System.out.println("You lost, better luck next time!");
        else System.out.println("There is no such number on a lottery ticket.");

        lotteryScanner.close();
    }
}
