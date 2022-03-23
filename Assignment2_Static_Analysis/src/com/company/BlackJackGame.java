package com.company;
import java.util.Random;

public class BlackJackGame {
    //initialize variables that will be used by the methods in this class
    //initialize card class
    private Card[] cards;
    //initialize variable to hold total cards
    private int cardLeft;
    //initialize variable to count player turns
    private int playerCounter=0;
    //initialize variable to hold player cards
    private int playerIndex=0;
    //initialize variable to count dealer turns
    private int dealerCounter=0;
    //initialize variable to hold dealer cards
    private int dealerIndex=0;

    //initialize game method
    public BlackJackGame(){
        cardLeft = 0;
        //initialize variable to hold card values
        String[] value = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        //calculates the total number of cards to be assigned
        cards = new Card[value.length];
        //for loops to assign every value to every suit
        for(int i=0; i < value.length; i++) {
            cards[cardLeft] = new Card(value[i]);
            cardLeft++;
        }
    }

    //initialize method to assign card value with suit and value at the every index within card array
    public void setCards(int index, String s,String f){
        if(index>=0 && index < cards.length) {
            cards[index].setCard(s, f);
        }
    }

    //initialize method to shuffle the deck as it will be assigned in the same order everytime
    //the method will cut deck in half and interchange card positions
    public void shuffle(){
        Random rand = new Random();
        int r1;
        for(int i =0; i<cardLeft/2;){
            r1 = rand.nextInt(cardLeft);
        }
    }

    //initialize method to assign score dependent on value of card
    public int Score(int x){
        int score = 0;
        for(int i=0; i<x; i++){
            if(cards[i].getValue().equals("Ace"))
                score+=1;
            else if(cards[i].getValue().equals("Two"))
                score+=2;
            else if(cards[i].getValue().equals("Three"))
                score+=3;
            else if(cards[i].getValue().equals("Four"))
                score+=4;
            else if(cards[i].getValue().equals("Five"))
                score+=5;
            else if(cards[i].getValue().equals("Six"))
                score+=6;
            else if(cards[i].getValue().equals("Seven"))
                score+=7;
            else if(cards[i].getValue().equals("Eight"))
                score+=8;
            else if(cards[i].getValue().equals("Nine"))
                score+=9;
            else
                score+=10;
        }
        return score;
    }

    //initialize method to deal cards which will start at the last position of card array and work down
    public Card deal(){
        cardLeft--;
        return cards[cardLeft];
    }

    //initialize method that will assign a card dependent the player selected
    public String assign(BlackJackGame deck, BlackJackGame hand, String type){
        //if player calls for assign method
        if(type=="hand"){
            //shift player array
            playerCounter++;
            //deal a card
            Card card = deck.deal();
            //assign card with suit and value
            hand.setCards(playerIndex, card.getSuit(), card.getValue());
            //print the card to console
            System.out.println(card);

            //print score to console
            System.out.println("Score of Hand: " + hand.Score(playerCounter));
            //check if score is higher or equal to blackjack
            checkBlackJack(hand.Score(playerCounter));
            System.out.println();
            //increment card array to be ready for next card
            playerIndex++;
        }
        //if dealer calls for assign method
        else if(type=="dealerHand"){
            dealerCounter++;
            Card card = deck.deal();
            hand.setCards(dealerIndex, card.getSuit(), card.getValue());
            System.out.println(card);
            System.out.println("Score of Dealer's Hand: " + hand.Score(dealerCounter));

            System.out.println();
            dealerIndex++;
        }
        return type;
    }

    //initialize method to check for blackjack or if higher than 21 when cards are assigned for either player or dealer
    public void checkBlackJack(int x){
        if(x==21){
            System.out.println("You win!");
            System.exit(0);
        }
        if(x>21){
            System.out.println("You Lose!");
            System.exit(0);
        }
    }

    //initialize method to return either player or dealer score
    public int returnScore(BlackJackGame hand){
        int h=0;
        h = hand.Score(playerCounter);
        h = hand.Score(dealerCounter);
        return h;
    }
}
