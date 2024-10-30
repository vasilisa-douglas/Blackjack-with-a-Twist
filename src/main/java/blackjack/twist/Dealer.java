/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack.twist;

/**
 * Dealer Class
 * @author vasilisa
 */
public class Dealer 
{
    Hand dealerHand;
    
    /**
     * Constructor
     */
    public Dealer()
    {
        
    }
    
    /**
     * drawCard()
     * @return - returns the card that is drawn
     * adds the drawn card to the dealerHand
     */
    public Card drawCard()
    {
        Card card = new Card();
        card.generateCard();
        dealerHand.addCard(dealerHand, card);
        
        return card;
    }
}
