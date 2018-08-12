package org.kys.Gof.strategy;

public interface Strategy {
    void study(boolean win);
    Hand nextHand();
    String getHandName();
}
