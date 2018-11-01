package com.company;

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
