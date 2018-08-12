package org.kys.Gof.bridge;

public class DubboAbstraction extends Abstraction{

    public DubboAbstraction(Implementor Implementor) {
        super(Implementor);
    }

    public void startToDisplay(int line){
        for(int a=0;a<line;a++){
            showprint(a*2);
        }
    }
}
