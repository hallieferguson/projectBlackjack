package com.company;

public class BlackjackHand extends Hand {

    private boolean isDealerTurn;
    private boolean hasBlackjack;

    public BlackjackHand(int maxCards) {
        super(maxCards);
        isDealerTurn = false;
        hasBlackjack = false;
    }

    public void setDealerTurn(boolean isDealerTurn) {
        this.isDealerTurn = isDealerTurn;
    }

    public boolean getDealerTurn() {
        return isDealerTurn;
    }
    public void setBlackjack() {
        hasBlackjack = true;
    }

    public boolean getBlackjack() {
        return hasBlackjack;
    }

    @Override
    public int getValue() {
        int value = 0;
        for (int i = 0; i < getNumCards(); i++) {
            value += getCard(i).getDefaultValue();
        }
        for (int i = 0; i < getNumCards(); i++) {
            if (getCard(i).isFaceCard()){
                value -= getCard(i).getDefaultValue();
                value += 10;
            }
            if (getCard(i).isAce()){
                value += 10;
            }
        }
        if (value > 21) {
            for (int i = 0; i < getNumCards(); i++) {
                if (getCard(i).isAce() && value > 21) {
                    value -= 10;
                }
            }
        }
        return value;
    }
}
