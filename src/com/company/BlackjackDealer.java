package com.company;

public class BlackjackDealer extends Player {

    private boolean dealerWantsHit;

    @Override
    public boolean wantsHit(Hand ownHand, Hand opponentHand) {
        if (opponentHand.getValue() <= 21) {
            dealerWantsHit = true;
        } else if (opponentHand.getValue() == 21 && opponentHand.getNumCards() == 2) {
            dealerWantsHit = false;
        }
        else if (opponentHand.getValue() > 21) {
            dealerWantsHit = false;
            if (ownHand.getValue() < 17) {
                dealerWantsHit = true;
            }
        }
        return dealerWantsHit;
    }
}
