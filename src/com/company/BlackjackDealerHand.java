package com.company;

public class BlackjackDealerHand extends BlackjackHand {

    public BlackjackDealerHand(int maxCards) {
        super(maxCards);
        setDealerTurn(false);
    }

    @Override
    public String toString() {
        String str = "";
        if (getDealerTurn() == true) {
            for (int i = 0; i < getNumCards(); i++) {
                str += (getCard(i));
                if (i < getNumCards() - 1) {
                    str += "  ";
                }
            }
            str += "  (value = " + getValue() + ")";
        }
        else {
            str += "XX  " + getCard(1) + "  (value = " + getCard(1).getDefaultValue() + ")";
        }
        return str;
    }

}
