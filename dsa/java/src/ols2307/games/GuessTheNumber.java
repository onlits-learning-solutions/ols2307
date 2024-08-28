package ols2307.games;

import java.util.Scanner;

public class GuessTheNumber {
    static void startGame(int low, int high) {
        int mid, i = 0;
        char response = 'n';
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Guess a number between %d and %d! Press [y] to continue...\n", low, high);
        response = scanner.next().charAt(0);
        if (response == 'y') {
            while (low <= high) {
                i++;
                mid = (low + high) / 2;
                System.out.printf("Is the number %d ([y]/[n])? ", mid);
                response = scanner.next().charAt(0);
                if (response == 'y') {
                    System.out.printf("Wow! I guessed your number in %d attempt(s)\n", i);
                    break;
                } else {
                    System.out.printf("Is %d too high ([y]/[n])? ", mid);
                    response = scanner.next().charAt(0);
                    if (response == 'y')
                        high = mid - 1;
                    else
                        low = mid + 1;
                }
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        GuessTheNumber.startGame(1, 100);
    }
}