package org.kys.Gof.bridge;

public class Main {
    public static void main(String[] args) {
        Abstraction display = new CountAbstraction(new StringImplementor("|","|","*"));
        display.showprint(6);
        System.out.println();
        ((CountAbstraction) display).startToDisplay(6);

        Abstraction display2 = new DubboAbstraction(new StringImplementor("|","|","*"));
        display.showprint(6);
        System.out.println();
        ((DubboAbstraction) display2).startToDisplay(6);
    }
}
