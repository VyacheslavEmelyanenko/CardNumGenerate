package com.epam.cardgenerator;

import com.epam.cardgenerator.utils.CardFactory;
import com.epam.cardgenerator.utils.CardHandler;
import com.epam.cardgenerator.cards.Card;

public class СardNumberGenerator {

    /**
     * Main method class
     * @param args set program arguments
     */
    public static void main(String[] args) {
        for (String typeCard : args) {
            Card card;

            try {
                card = CardFactory.getCard(typeCard.toUpperCase());
                CardHandler.printCardInfo(card);

            } catch (IllegalArgumentException e) {
                System.out.println("Введен несуществующий тип карты: " + typeCard);
            }
        }
    }
}
