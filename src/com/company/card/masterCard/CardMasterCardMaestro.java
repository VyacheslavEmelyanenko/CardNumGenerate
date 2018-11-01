package com.company.card.masterCard;

import com.company.CardBasic;

public class CardMasterCardMaestro extends CardBasic implements ICardMasterCard {

    /**
     *Method generating number card
     * @return number card
     */
    public CardMasterCardMaestro() {
        super(NUMBERFIRST + "2222", 16);
    }
}