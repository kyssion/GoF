package org.kys.Gof.strategy;

public class PlayerContext {
    private String name;
    private Strategy strategy;
    private int wincount=0;
    private int losecount=0;
    private int gamecount=0;

    public PlayerContext(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand(){
        return strategy.nextHand();
    }

    public void win(){
        strategy.study(true);
        gamecount++;
        wincount++;
    }
    public void lose(){
        strategy.study(false);
        gamecount++;
        losecount++;
    }

    public void even(){
        gamecount++;
    }
    public double winRate(){
        return (double)wincount/(double) gamecount;
    }
    public String getHandName(){
        return strategy.getHandName();
    }
}
