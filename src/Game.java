import java.util.*;
public class Game{
    private final int STARTINGCASH = 200;
    static ArrayList<Player> playerList;
    ArrayList<Deck> deckList;
    static Player currPlayer;
    static int currPlayerIndex;
    static Hand currHand;
    static int currHandIndex;
    
    public Game(int numPlayers , int numDecks){
        startGame(numPlayers , numDecks);
    }
    
    public void startGame(int numPlayers , int numDecks){
        for(int i = 0; i < numDecks; i ++){
            Deck d = new Deck();
            d.shuffle();
            deckList.add(d);
        }
        
        for(int i = 0; i < numPlayers; i ++){
            playerList.add(new Player("" + i, STARTINGCASH));
        }

        for(int i = 0; i < numPlayers; i ++){
            ArrayList<Hand> handList = playerList.get(i).getHands();
            for(int j = 0; j < handList.size(); j ++){
                currHand = handList.get(j);
                if(deckList.get(0).getNumCards() <= 0)
                    deckList.remove(0);

                currHand.addCard(deckList.get(0).draw());
            }
        }
        currPlayerIndex = 0;
        currPlayer = playerList.get(0);
        currHandIndex = 0;
        currHand = currPlayer.getHands().get(0);
    }

    public void endAction(){
        currHandIndex = currHandIndex + 1;
        if(currHandIndex < currPlayer.getHands().size())
            currHand = currPlayer.getHands().get(currHandIndex);
        else{
            currPlayerIndex = (currPlayerIndex + 1) % playerList.size();
            currPlayer = playerList.get(currPlayerIndex);
            currHandIndex = 0;
            currHand = currPlayer.getHands().get(currHandIndex);
        }
    }

    public void stand(){
        endAction();
    }

    public void hit(){
        if(deckList.get(0).getNumCards() <= 0)
            deckList.remove(0);

        currHand.addCard(deckList.get(0).draw());
        
        if(currHand.leastValue() > 21)
            endAction();
    }
    
    public void doubleDown(){
        if(currPlayer.getLargestHand().size() == 2){
            currPlayer.bet(currPlayer.getBet() * 2);
            if(deckList.get(0).getNumCards() <= 0)
                deckList.remove(0);
            Card currCard = deckList.get(0).draw();
            currCard.faceDown();
            currHand.addCard(currCard);
            
            if(currHand.leastValue() > 21)
                endAction();
        }
    }
    
    public void split(){
        if(currHand.size() == 2){
            if(currHand.getCards().get(0) == currHand.getCards().get(1)){
                currPlayer.bet(currPlayer.getBet() * 2);
                currPlayer.createNewHand();
                currPlayer.getHands().get(currPlayer.getHands().size() - 1).addCard(currHand.getCards().remove(0));
            }
        }
    }

    public Player getCurrPlayer(){}
        
}
    
    

    
    

    
        
        