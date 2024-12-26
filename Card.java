
// add your own banner here

public class Card implements Comparable<Card>{
	
	private int suit; // use integers 1-4 to encode the suit
	private int rank; // use integers 1-13 to encode the rank
	
	public Card(int s, int v){
		//make a card with suit s and value v

		suit = s;
		rank = v;
	}
	
	public int compareTo(Card c){

		return this.getRank()-c.getRank();
		// use this method to compare cards so they 
		// may be easily sorted

	}
	
	public String toString(){
        String report;
        report = getStringSuit() +getRank();
		return report;
    }
    public int getRank(){
        return rank;
    }
    public String getStringSuit(){
        String str_suit="";
        if(suit==1)
        str_suit="c";
        else if(suit==2)
        str_suit="d";
        else if(suit==3)
        str_suit="h";
        else if(suit==4)
        str_suit="s";
        return str_suit;
    }
    public int getSuit(){
        return suit;
    }
}
