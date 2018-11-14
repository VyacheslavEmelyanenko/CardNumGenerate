package com.epam.cardgenerator;

import com.epam.cardgenerator.utily.information.ConsoleInfoOutput;
import com.epam.cardgenerator.utily.information.InfoOutput;
import com.epam.cardgenerator.utily.numgenerator.CardFactory;
import com.epam.cardgenerator.cards.Card;

public class CardNumberGenerator {

        private InfoOutput cardInfoOutput = new ConsoleInfoOutput();

        /**
         * Program entry point
         *
         * @param args program arguments
         */
        public static void main(String[] args) {
            CardNumberGenerator cardGenerator = new CardNumberGenerator();
            cardGenerator.processGeneration(args);
        }

        /**
         * Method for output certain card info
         *
         * @param card card
         */
        public void outputCardInfo(Card card) {
            cardInfoOutput.outputCardInfo(card);
        }

        /**
         * Method for generating certain card class instance depending on card type
         *
         * @param cardType card type
         * @return generated card
         * @throws InstantiationException   InstantiationException
         * @throws IllegalAccessException   IllegalAccessException
         * @throws IllegalArgumentException IllegalArgumentException
         */
        public Card generateCard(String cardType) throws InstantiationException,
                IllegalAccessException, IllegalArgumentException {
            Card card = CardFactory.getCard(cardType);

            return card;
        }

        /**
         * Method for processing cards generation: generating cards depending on input cards types
         * and output their information
         *
         * @param cardTypes String with card types
         */
        public void processGeneration(String[] cardTypes) {

            for (String cardType : cardTypes) {
                try {
                    Card card = generateCard(cardType);
                    outputCardInfo(card);
                } catch (InstantiationException | IllegalAccessException | IllegalArgumentException exception) {
                    cardInfoOutput.outputCardException(exception);
                }
            }
        }

    }
