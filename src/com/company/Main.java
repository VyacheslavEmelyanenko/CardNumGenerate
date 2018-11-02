package com.company;

import com.company.utils.CardFactory;
import com.company.valid.CardValidate;
import com.company.valid.LuhnValidate;

public class Main {

    public static void main(String[] args) {
        CardValidate validator = new LuhnValidate();
        for (String typeCard : args) { 

            ICard card = CardFactory.getCard(typeCard.toUpperCase());

            String number = card.getNumber();

            System.out.println(card.getClass().getSimpleName() + ": " + number + " " + validator.validateCard(number));
        }
    }
}
