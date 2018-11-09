package com.epam.cardgenerator.utils;

import com.epam.cardgenerator.cards.Card;
import com.epam.cardgenerator.validate.CardLuhnValidator;

public class CardHandler {

    /**
     * Method for printing certain card information: it's name, number, validity check
     *
     * @param card card which info you want to print
     */
    public static void printCardInfo(Card card) {
        System.out.println(card.getClass().getSimpleName() + ": " + card.getNumber() + " : "
                + CardLuhnValidator.isCardNumberValid(card.getNumber()));
    }
}
