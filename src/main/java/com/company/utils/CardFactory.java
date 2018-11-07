package com.company.utils;

import com.company.cards.Card;
import com.company.cards.CardList;

/**
 * Card Fabric
 */
public class CardFactory {
    public static Card getCard(String typeCard) {
        Card card = null;

        try {
            card = (Card) CardList.valueOf(typeCard).getCard().newInstance();
        } catch (InstantiationException e1) {
            e1.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (IllegalArgumentException e3) {
            System.out.println("Введен несуществующий тип карты: " + typeCard);
        }

        return card;
    }
}
