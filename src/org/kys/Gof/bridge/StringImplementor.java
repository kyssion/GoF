package org.kys.Gof.bridge;

public class StringImplementor extends Implementor{
    private String cStart;
    private String cEnd;
    private String item;
    public StringImplementor(String cStart,String cEnd,String item) {
        this.cStart = cStart;
        this.cEnd = cEnd;
        this.item=item;
    }
    @Override
    public void print(int length) {
        System.out.print(cStart);
        for(int a=0;a<length;a++){
            System.out.print(item);
        }
        System.out.println(cEnd);
    }
}
