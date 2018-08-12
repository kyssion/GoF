package org.kys.Gof.adapter;

public class AdapterInterfaceImpShopItem extends ShowItem implements AdapterImterface {
    @Override
    public String show(String s) {
        return "*"+this.showItem(s)+"*";
    }
}
