package org.kys.Gof.strategy;

public class Hand {
    public static final int HANDVALUE_GUU = 0;
    public static final int HANDVALUE_GHO = 1;
    public static final int HANDVALUE_PAA = 2;
    public static final Hand[] head = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_GHO),
            new Hand(HANDVALUE_PAA)
    };

    public static final int WIN = 1;
    public static final int LOST = 2;
    public static final int EVEN = 3;

    private final int HANDVALUE;

    private String[] name={
            "石头","剪刀","布"
    };

    public String getName(){
        return name[this.HANDVALUE];
    }

    public Hand(int HANDVALUE){
      this.HANDVALUE=HANDVALUE;
    }

    public static Hand getHand(int handValue){
        return head[handValue];
    }

    public int getHandValue(){
        return this.HANDVALUE;
    }

    public int iswin(Hand hand){
        if(this.HANDVALUE==hand.getHandValue()){
            return EVEN;//平
        }else if(this.HANDVALUE+1%3==hand.getHandValue()){
            return WIN;//胜
        }else{
            return LOST;
        }
    }
}
