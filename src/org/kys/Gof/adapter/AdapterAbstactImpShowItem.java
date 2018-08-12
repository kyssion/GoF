package org.kys.Gof.adapter;

public class AdapterAbstactImpShowItem extends AdapterAbstractClass{

    private ShowItem showItem;

    public AdapterAbstactImpShowItem(ShowItem showItem){
        this.showItem = showItem;
    }

    @Override
    public String show(String s) {
        return "&&"+this.showItem.showItem(s)+"&&";
    }
}
