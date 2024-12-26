import java.util.ArrayList;
// add your own banner here

public class Player {
	
		
	private ArrayList<Card> hand; // the player's cards
	private double bankroll;
        private double bet;

	// you may choose to use more instance variables
		
	public Player(){		
	    // create a player here
        bankroll=100;
        bet=0.0;
        hand = new ArrayList<Card>();
	}

	public void addCard(Card c){
        hand.add(c);
	    // add the card c to the player's hand
	}

	public void removeCard(Card c){
        for(int i=0;i<hand.size();i++){
            if(hand.get(i).getRank()==c.getRank()&&
            hand.get(i).getSuit()==c.getSuit())
            {
                hand.remove(i);
            }
       
        }
	    // remove the card c from the player's hand
        }

        public void bets(double amt){
            // player makes a bet
            bet=amt;
        }

  public void winnings(double odds){
      bankroll=bankroll-bet+bet*odds;
            //	adjust bankroll if player wins
       }

        public double getBankroll(){
            return bankroll;
            // return current balance of bankroll
       }

        // you may wish to use more methods here
        public ArrayList<Card>getHand(){
            return hand;
        }
        public void clearHand(){
            hand = new ArrayList<Card>();
        }
}


