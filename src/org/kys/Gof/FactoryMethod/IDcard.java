package org.kys.Gof.FactoryMethod;

public class IDcard {
    private String cardName;
    private String name;

    public IDcard(String cardName,String name){
        this.cardName=cardName;
        this.name=name;
        System.out.println("创建了"+this.getName()+"的"+this.getCardName()+"卡片");
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
