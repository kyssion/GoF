package org.kys.Gof.adapter;

public class Main {
    public static void main(String[] args) {
        ShowItem showItem = new ShowItem();
        AdapterImterface adapterImterface = new AdapterInterfaceImpShopItem();
        AdapterAbstractClass adapterAbstractClass = new AdapterAbstactImpShowItem(showItem);
        System.out.println(adapterImterface.show("123123"));
        System.out.println(adapterAbstractClass.show("123123"));
    }
}
