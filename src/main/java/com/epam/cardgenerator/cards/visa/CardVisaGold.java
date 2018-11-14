package com.epam.cardgenerator.cards.visa;

import com.epam.cardgenerator.cards.CardBasic;

public class CardVisaGold extends CardBasic {

    private static final String BIN_NUMBER = "49999";

    private static final int LENGTH_NUMBER_CARD = 17;

    /**
     *Method generating number cards
     * @return number cards
     */
    public CardVisaGold() {
        super(BIN_NUMBER, LENGTH_NUMBER_CARD);
    }
}
