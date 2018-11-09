package com.epam.cardgenerator.cards;

import com.epam.cardgenerator.cards.masterCard.CardMasterCardElectronic;
import com.epam.cardgenerator.cards.masterCard.CardMasterCardMaestro;
import com.epam.cardgenerator.cards.masterCard.CardMasterCardStandard;
import com.epam.cardgenerator.cards.mir.CardMirClassic;
import com.epam.cardgenerator.cards.mir.CardMirDebet;
import com.epam.cardgenerator.cards.mir.CardMirPremium;
import com.epam.cardgenerator.cards.visa.CardVisaClassic;
import com.epam.cardgenerator.cards.visa.CardVisaElectron;
import com.epam.cardgenerator.cards.visa.CardVisaGold;

/**
 * Class implements the enumeration card
 */
public enum CardList {
    CARDVISAGOLD(CardVisaGold.class),
    CARDVISACLASSIC(CardVisaClassic.class),
    CARDVISAELECTRON(CardVisaElectron.class),
    CARDMASTERCARDSTANDARD(CardMasterCardStandard.class),
    CARDMASTERCARDELECTRONIC(CardMasterCardElectronic.class),
    CARDMASTERCARDMAESTRO(CardMasterCardMaestro.class),
    CARDMIRCLASSIC(CardMirClassic.class),
    CARDMIRPREMIUM(CardMirPremium.class),
    CARDMIRDEBET(CardMirDebet.class);

    private Class card;

    /**
     * Constructor with card parameter
     * @param card type card
     */
    CardList(Class card) {
        this.card = card;
    }

    /**
     * Method returning class card
     * @return returning class card
     */
    public Class getCard() {
        return card;
    }
}
