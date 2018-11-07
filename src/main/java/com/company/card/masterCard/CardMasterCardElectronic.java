package com.company.card.masterCard;

import com.company.CardBasic;

public class CardMasterCardElectronic extends CardBasic implements ICardMasterCard {

    /**
     *Method generating number card
     * @return number card
     */
    public CardMasterCardElectronic() {
        super(NUMBER_FIRST + "1111", 17);
    }
}
