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
    public Card(String value,String suit){
        this.suit = suit;
        this.value = value;
    }

    //initialize setter method to card to have suit and value assigned
    public void setCard(String value,String suit){
        long startTime = System.nanoTime();
        this.value = value;
        this.suit = suit;
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Execution time of setCard method in nanoseconds is: " + totalTime);
    }

    //initialize method to allow card to be display in console, also makes return value string
    public String toString(){
        long startTime = System.nanoTime();
        String name = value + " of " + suit;
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Execution time of toString method in nanoseconds is: " + totalTime);
        return name;
    }
}
