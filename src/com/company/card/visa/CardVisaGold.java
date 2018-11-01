package com.company.card.visa;

import com.company.CardBasic;

public class CardVisaGold extends CardBasic implements ICardVisa {

    /**
     *Method generating number card
     * @return number card
     */
    public CardVisaGold() {
        super(NUMBERFIRST + "9999", 17);
    }
}
