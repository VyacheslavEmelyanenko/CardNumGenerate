package com.company.card.visa;

import com.company.CardBasic;

public class CardVisaClassic extends CardBasic implements ICardVisa {

    /**
     *Method generating number card
     * @return number card
     */
    public CardVisaClassic() {
        super(NUMBERFIRST + "9999", 17);
    }
}
