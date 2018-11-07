package com.company.card.mir;

import com.company.CardBasic;

/**
 * Class creating CardMirClassic
 */
public class CardMirClassic extends CardBasic implements ICardMir {

    /**
     *Method generating number card
     */
    public CardMirClassic() {
        super(NUMBER_FIRST + "4444", 18);
    }
}
