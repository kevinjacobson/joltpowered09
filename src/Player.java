import java.util.ArrayList;

/**
 * @author kj
 *
 */




public class Player {

	private String _name;
	private ArrayList<Hand> _hands;
	private int _totalCash;
	private int _bet;
	private boolean _in;
	
	/**
	 * Default Constructor for player
	 * @param name the name of this player
	 * @param startingCash cash the player is starting with
	 * @param c1 first card dealt
	 * @param c2 second card dealt
	 */
	public Player(String name,int startingCash,Card c1,Card c2){
		_name = name;
		_totalCash = startingCash;
		_bet = 0;
		_hands = new ArrayList<Hand>();
		_hands.add(new Hand());
		_hands.get(0).addCard(c1);
		_hands.get(0).addCard(c2);
	}
	
	
	
	
	public ArrayList<Hand> getHands(){
		return _hands;
	}

	public void createNewHand(){
		_hands.add(new Hand());
	}
	
	
	public String getName(){
		return _name;
	}
	
	public String toString(){
		String result = _name + "\n" +
		"Total Cash:\t" + _totalCash + "\n" +
		"Bet:\t\t" + _bet + "\n";
		int index=1;
		for(Hand h: _hands){
			result +="Hand " + index + ":\t\t" + h;
		}
	}
	
	
}
