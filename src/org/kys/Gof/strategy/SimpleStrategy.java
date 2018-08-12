package org.kys.Gof.strategy;

import java.util.Random;

public class SimpleStrategy implements Strategy {

    private boolean win = true;
    private int preHandValue = 0;

    @Override
    public void study(boolean win) {
        this.win = win;
    }

    @Override
    public Hand nextHand() {
        this.preHandValue = new Random().nextInt(3);
        return Hand.getHand(preHandValue);
    }

    @Override
    public String getHandName() {
        return Hand.getHand(preHandValue).getName();
    }
}
