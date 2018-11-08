package com.company;

import com.company.utils.CardFactory;
import com.company.validate.CardValidate;
import com.company.validate.LuhnValidate;
import com.company.cards.Card;

public class СardNumberGenerator {

    /**
     * Main method class
     * @param args set program arguments
     */
    public static void main(String[] args) {
        CardValidate validator = new LuhnValidate();
        for (String typeCard : args) {
            Card card = CardFactory.getCard(typeCard.toUpperCase());

            if (card == null) {
                continue;
            }
            String number = card.getNumber();

            System.out.println(card.getClass().getSimpleName().toUpperCase() + ": " + number + " " + validator.validateCard(number));
        }
    }
}
