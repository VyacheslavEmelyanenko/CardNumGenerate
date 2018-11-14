package com.epam.cardgenerator.cards.masterCard;

import com.epam.cardgenerator.cards.CardBasic;

public class CardMasterCardMaestro extends CardBasic {

    private static final String BIN_NUMBER = "522222";

    private static final int LENGTH_NUMBER_CARD = 16;

    /**
     *Method generating number cards
     * @return number cards
     */
    public CardMasterCardMaestro() {
        super(BIN_NUMBER,LENGTH_NUMBER_CARD);
    }
}
