package com.company;
import java.util.Scanner;

public class ConsolePlayer extends Player {
    Scanner console = new Scanner(System.in);
    private char input;
    private String askHit = "";
    private boolean playerWantsHit = false;

    @Override
    public boolean wantsHit(Hand ownHand, Hand opponentHand) {
        System.out.println("Hit? (y/n)");
        askHit = console.nextLine();
        input = askHit.charAt(0);
        if (input == 'y') {
            playerWantsHit = true;
        }
        else {
            playerWantsHit = false;
        }
        return playerWantsHit;
    }

}
