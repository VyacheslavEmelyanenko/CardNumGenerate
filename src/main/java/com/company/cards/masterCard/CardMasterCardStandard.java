package com.company.cards.masterCard;

import com.company.cards.CardBasic;

public class CardMasterCardStandard extends CardBasic {
    private static final String BIN_NUMBER = "533333";
    private static final int LENGTH_NUMBER_CARD = 18;
    /**
     *Method generating number cards
     * @return number cards
     */
    public CardMasterCardStandard() {
        super(BIN_NUMBER, LENGTH_NUMBER_CARD);
    }
}
