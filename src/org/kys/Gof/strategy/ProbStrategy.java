package org.kys.Gof.strategy;

import java.util.Random;

/**
 * 学习自身的
 */
public class ProbStrategy implements Strategy{

    private int[][] recording={
            {1,1,1},{1,1,1},{1,1,1}
    };

    private int preValue=1;
    private int currentValue=1;
    private int handvalue=1;
    @Override
    public void study(boolean win) {
        if(win){
            recording[preValue][currentValue]++;
        }else{
            recording[preValue][(currentValue+1)%3]++;
            recording[preValue][(currentValue+2)%3]++;
        }
    }

    private static Random random = new Random();
    
    @Override
    public Hand nextHand() {
        int allSum = 0;
        for (int a=0;a<3;a++){
            allSum+=recording[currentValue][a];
        }
        int ran = random.nextInt(allSum);
        if(ran<recording[currentValue][0]){
            handvalue=0;
        }else if(ran<recording[currentValue][0]+recording[currentValue][1]){
            handvalue=1;
        }else {
            handvalue=2;
        }
        preValue=currentValue;
        currentValue=handvalue;
        return Hand.getHand(handvalue);
    }

    @Override
    public String getHandName() {
        return Hand.getHand(handvalue).getName();
    }
}
