package com.epam.cardgenerator.cards.mir;

import com.epam.cardgenerator.cards.CardBasic;

/**
 * Class creating CardMirDebet
 */
public class CardMirDebet extends CardBasic {
    private static final String BIN_NUMBER = "255555";
    private static final int LENGTH_NUMBER_CARD = 16;
    /**
     *Method generating number cards
     * @return number cards
     */
    public CardMirDebet() {
        super(BIN_NUMBER, LENGTH_NUMBER_CARD);
    }
}
