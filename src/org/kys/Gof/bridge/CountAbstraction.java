package org.kys.Gof.bridge;

public class CountAbstraction extends Abstraction {
    public CountAbstraction(Implementor implementor) {
        super(implementor);
    }
    public void startToDisplay(int line){
        for(int a=0;a<line;a++){
            showprint(a);
        }
    }
}
