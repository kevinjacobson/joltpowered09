public class Card{
    String type , suit;
    int value;
    boolean faceDown = false;
    
    public Card(String type , String suit , int value){
        this.type = type;
        this.suit = suit;
        this.value = value;
    }

    public Card(String type , String suit , int value, boolean faceDown){
        this(type , suit , value);
        this.faceDown = faceDown;
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

    public void faceDown(){
        faceDown = true;
    }
    
    public boolean isFaceDown(){
        return faceDown;
    }
}

    