package com.company.card.mir;

import com.company.CardBasic;

/**
 * Class creating CardMirPremium
 */
public class CardMirPremium extends CardBasic implements ICardMir {

    /**
     *Method generating number card
     * @return number card
     */
    public CardMirPremium() {
        super(NUMBER_FIRST + "6666", 17);
    }
}
