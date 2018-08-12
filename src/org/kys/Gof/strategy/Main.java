package org.kys.Gof.strategy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PlayerContext player1= new PlayerContext("tom",new SimpleStrategy());
        PlayerContext player2 = new PlayerContext("jack",new SimpleStrategy());
                //new PlayerContext("jack",new ProbStrategy());
        for(int a=0;a<10000;a++){
            Hand player1Hand = player1.nextHand();
            Hand player2Hand = player2.nextHand();
            if(player1Hand.iswin(player2Hand)== Hand.WIN){
                player1.win();
                player2.lose();
                System.out.println("palyer1胜  tom:"+player1.getHandName()+" | jack:"+player2.getHandName());
            }else if(player1Hand.iswin(player2Hand)== Hand.LOST){
                player1.lose();
                player2.win();
                System.out.println("palyer2胜  tom:"+player1.getHandName()+" | jack:"+player2.getHandName());
            }else{
                player1.even();
                player2.even();
                System.out.println("player 平  tom:"+player1.getHandName()+" | jack:"+player2.getHandName());
            }
        }
        System.out.println("tom Win rate:"+player1.winRate());
        System.out.println("jack Win rate:"+player2.winRate());
    }
    public static void hhh2(){
        Random random = new Random();
        for (int a=0;a<100;a++){
            System.out.println(random.nextInt(5));
        }
    }
}
