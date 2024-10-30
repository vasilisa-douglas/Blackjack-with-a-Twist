/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack.twist;
import java.util.ArrayList;

/**
 * Hand Class
 * @author vasilisa
 */

public class Hand 
{
    private ArrayList<Card> cards;
    
    /**
     * Constructor
     */

    public Hand() 
    {
        cards = new ArrayList<Card>();
    }

    /**
     * sumHand()
     * @param cardHand - Hand object
     * @return int - returns sum of cards in cardHand
     */
    public int sumHand(Hand cardHand)
    {
        int sum = 0;
        for(int i = 0; i < cardHand.cards.size(); i++)
        {
            sum += cardHand.cards.get(i).getRank();
        }
        return sum;
    }
    
    /**
     * addCard()
     * @param cardHand - a Hand object
     * @param card - Card object to be added to the Hand cardHand
     */
    public void addCard(Hand cardHand, Card card)
    {
        cardHand.cards.add(card);
    }

}
