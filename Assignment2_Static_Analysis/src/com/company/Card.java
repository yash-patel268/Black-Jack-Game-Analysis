package com.company;

public class Card {
    //initialize variables for card suit and value
    private String suit;
    private String value;

    //initialize card method
    public Card() {}

    //getter method for card suit
    public String getSuit(){
        return suit;
    }

    //getter method for card value
    public String getValue(){
        return value;
    }

    //initialize card method that can take parameters
    public Card(String suit){
        this.suit = suit;
    }

    //initialize setter method to card to have suit and value assigned
    public void setCard(String value){
        this.value = value;
    }

    //initialize method to allow card to be display in console, also makes return value string
    public String toString(){
        String name = value + " of " + suit;
        return name;
    }
}
