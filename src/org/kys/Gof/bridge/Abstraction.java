package org.kys.Gof.bridge;

public class Abstraction {
    private Implementor implementor=null;
    public Abstraction(Implementor implementor){
        this.implementor = implementor;
    }
    public void showprint(int speed){
        implementor.print(speed);
    }
}
