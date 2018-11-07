package com.company.card.visa;

import com.company.CardBasic;


/**
 * Class creating CardVisaElectron
 */
public class CardVisaElectron extends CardBasic implements ICardVisa {

    /**
     *Method generating number card
     * @return return number card
     */
    public CardVisaElectron() {
        super(NUMBER_FIRST + "8888", 16);
    }
}
