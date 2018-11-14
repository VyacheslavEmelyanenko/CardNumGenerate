package com.epam.cardgenerator.utily.information;

import com.epam.cardgenerator.cards.Card;

/**
 * Class for handling information about certain card
 */
public class ConsoleInfoOutput implements InfoOutput {

    /**
     * Method for printing certain card information: it's name, number, validity check
     *
     * @param card card which info you want to print
     */
    public void outputCardInfo(Card card) {
        System.out.println(card.getClass().getPackage().getName().
                substring(card.getClass().getPackage().getName().lastIndexOf(".") + 1)
                + " " + card.getClass().getSimpleName() + ": " + card.getNumber());
    }

    /**
     * Method for output exception
     *
     * @param exception exception for output
     */
    public void outputCardException(Exception exception) {
        System.err.println(exception.getMessage());
    }
}

