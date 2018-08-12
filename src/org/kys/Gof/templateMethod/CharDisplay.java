package org.kys.Gof.templateMethod;

public class CharDisplay extends AbstractDisplay{

    private char itemChar;
    public CharDisplay(char itemChar){
        this.itemChar=itemChar;
    }

    public CharDisplay(int speed,char itemChar){
        this.setSpeed(speed);
        this.itemChar=itemChar;
    }

    @Override
    public void start() {
        System.out.print("<<");
    }

    @Override
    public void stop() {
        System.out.println(">>");
    }

    @Override
    public void print() {
        System.out.print(this.itemChar);
    }
}
