package com.epam.cardgenerator.utily.information;


import com.epam.cardgenerator.cards.Card;

/**
 * Class for output different information about card
 */
public interface InfoOutput {

    /**
     * Method for printing card information: it's name, number, validity check
     *
     * @param card card which info you want to print
     */
    void outputCardInfo(Card card);

    /**
     * Method for output exception
     *
     * @param exception exception for output
     */
    void outputCardException(Exception exception);
}
