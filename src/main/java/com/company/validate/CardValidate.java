package main.java.com.company.validate;

/**
 * Abstract class that implements the validate
 */
public abstract class CardValidate {
    protected CardValidate next;

    /**
     * Method seting next validator
     * @param validator seting next validator
     */
    public void setNext(CardValidate validator) {
        next = validator;
    }

    /**
     * Abstract method validating card
     * @param cardNumber number card
     * @return returning true or false
     */
    public abstract boolean validateCard(String cardNumber);
}
