package main.java.com.company.cards;

import main.java.com.company.cards.masterCard.CardMasterCardElectronic;
import main.java.com.company.cards.masterCard.CardMasterCardMaestro;
import main.java.com.company.cards.masterCard.CardMasterCardStandard;
import main.java.com.company.cards.mir.CardMirClassic;
import main.java.com.company.cards.mir.CardMirDebet;
import main.java.com.company.cards.mir.CardMirPremium;
import main.java.com.company.cards.visa.CardVisaClassic;
import main.java.com.company.cards.visa.CardVisaElectron;
import main.java.com.company.cards.visa.CardVisaGold;

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
