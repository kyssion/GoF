package org.kys.Gof.FactoryMethod;

public class BookProduct implements Product{
    IDcard iDcard;
    public BookProduct(IDcard iDcard){
        this.iDcard=iDcard;
    }
    @Override
    public void use() {
        System.out.println(iDcard.getName()+"正在使用：\""+iDcard.getCardName()+"\"ID 卡");
    }
}
