public class Card{
    String type , suit;
    int value;
    
    public Card(String type , String suit , int value){
        this.type = type;
        this.suit = suit;
        this.value = value;
    }
    
    public String getSuit(){
        return suit;
    }

    public int getValue(){
        return value;
    }
    
    public String getType(){
        return type;
    }

    public String toString(){
        return value + " of " + suit;
    }
}

    