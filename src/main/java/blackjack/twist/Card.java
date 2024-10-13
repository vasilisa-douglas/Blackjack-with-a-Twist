package blackjack.twist;

import java.util.Random;

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
     * @param suit - the suit of the card
     * @param rank - the rank of the card (1 = Ace, 11 = Jack, 12 = Queen, 13 = King)
     */
    public Card(Suit suit, int rank)
    {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * @return - a new random Card object
     */
    public Card generateCard()
    {
        Random random = new Random();
        Suit[] suits = Suit.values();
        Suit randomSuit = suits[random.nextInt(suits.length)];
        int randomRank = random.nextInt(13) + 1;  // Ranks from 1 to 13

        return new Card(randomSuit, randomRank);
    }

    /**
     * @param otherCard - the card to compare to
     * @return - positive if this card has a higher rank, negative if lower, and 0 if equal
     */
    public int compareCard(Card otherCard)
    {
        return Integer.compare(this.rank, otherCard.rank);
    }

    /**
     * @return - the suit of the card
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @return - the rank of the card
     */
    public int getRank() {
        return rank;
    }

    /**
     * @return - string representation of the card
     */
    @Override
    public String toString() {
        String[] rankNames = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        return rankNames[rank - 1] + " of " + suit;
    }
}
