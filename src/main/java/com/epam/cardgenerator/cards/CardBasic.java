package com.epam.cardgenerator.cards;

import com.epam.cardgenerator.validator.LuhnNumberGenerator;
import com.epam.cardgenerator.validator.NumberGenerator;

/**
 * Base class for all card
 */
public abstract class CardBasic implements Card {

    protected String numberBIN;
    protected int numberLength;
    private NumberGenerator cardNumberGenerator = new LuhnNumberGenerator();

    /**
     * Class generating number cards, setting BIN and Length cards
     * @param numberBIN BIN cards
     * @param numberLength length number cards
     */
    public CardBasic(String numberBIN, int numberLength) {

        this.numberBIN = numberBIN;
        this.numberLength = numberLength;
    }

    /**
     * Method generating number cards
     * @return number cards
     */
    @Override
    public String getNumber() {
        return cardNumberGenerator.generateNumber(numberBIN, numberLength);
    }
}
