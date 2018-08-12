package org.kys.Gof.templateMethod;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay display1 =new CharDisplay('A');
        AbstractDisplay display2 = new StringDisplay("template");
        AbstractDisplay display3 = new StringDisplay("GAF_TEMPLATE");
        display1.display();
        display2.display();
        display3.display();
    }
}
