package com.company;

/*
 * Player.java
 *
 * Computer Science 111, Boston University
 *
 * YOU SHOULD NOT MODIFY THIS FILE.
 */

import java.util.Scanner;

public abstract class Player {
    public abstract boolean wantsHit(Hand ownHand, Hand opponentHand);
}