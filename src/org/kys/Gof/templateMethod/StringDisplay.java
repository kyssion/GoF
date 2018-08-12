package org.kys.Gof.templateMethod;

public class StringDisplay extends AbstractDisplay{

    private String string_name;

    public StringDisplay(String s){
        this.string_name = s;
    }

    public StringDisplay(String s,int speed){
        this.setSpeed(speed);
        this.string_name=s;
    }

    @Override
    public void start() {
        printLine();
    }

    @Override
    public void stop() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for (int a=0;a<this.string_name.length();a++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void print() {
        System.out.println("|"+this.string_name+"|");
    }
}
