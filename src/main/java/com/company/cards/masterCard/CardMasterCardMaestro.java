package main.java.com.company.cards.masterCard;

import main.java.com.company.cards.CardBasic;

public class CardMasterCardMaestro extends CardBasic {
    private static final String BIN_NUMBER = "422222";
    private static final int LENGTH_NUMBER_CARD = 16;
    /**
     *Method generating number cards
     * @return number cards
     */
    public CardMasterCardMaestro() {
        super(BIN_NUMBER,LENGTH_NUMBER_CARD);
    }
}
