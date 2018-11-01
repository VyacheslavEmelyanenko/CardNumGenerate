package com.company.card.visa;

import com.company.CardBasic;

import static com.company.card.visa.ICardVisa.NUMBERFIRST;

/**
 * Class creating CardVisaElectron
 */
public class CardVisaElectron extends CardBasic implements ICardVisa {

    /**
     *Method generating number card
     * @return number card
     */
    public CardVisaElectron() {
        super(NUMBERFIRST + "8888", 16);
    }
}
