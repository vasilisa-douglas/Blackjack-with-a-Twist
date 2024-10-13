/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack.twist;

/**
 * Card Class
 * @author vasilisa
 */
public class Card 
{
    enum Suit 
    {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }
    
    private Suit suit;
    private int rank;
    
    /**
     * Constructor
     */
    public Card()
    {
        rank = 0;
    }
    
    /**
     * generateCard()
     * @return - returns Card object that is generated
     */
    public Card generateCard()
    {
        Card card = new Card();
        return card;
    }
    
    /**
     * compareCard()
     * @return - returns int based on comparison
     */
    public int compareCard()
    {
        return 0;
    }
    
}
