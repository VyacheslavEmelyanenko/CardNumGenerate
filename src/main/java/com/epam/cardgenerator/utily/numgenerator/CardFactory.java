package com.epam.cardgenerator.utily.numgenerator;

import com.epam.cardgenerator.cards.Card;
import com.epam.cardgenerator.cards.CardList;

/**
 * Class-factory for getting cards class instance depending on card type
 */
public class CardFactory {

    /**
     * Method for getting instance of desired card class
     *
     * @param typeCard - Type of desired cards
     * @return - Desired cards
     */
    public static Card
    getCard(String typeCard) throws InstantiationException, IllegalAccessException, IllegalArgumentException {
        Card card = (Card) CardList.valueOf(typeCard.toUpperCase()).getCard().newInstance();

        return card;
    }
}
