package org.kys.Gof.builder;

import java.util.HashMap;

public class Director {
    private HashMap<String,Builer> map = new HashMap<>();
    public Director(String name,Builer builer){
        map.put(name,builer);
    }
    public Director(){
        super();
    }
    public boolean setBuiler(String name,Builer builer){
        if(builer==null){
            return false;
        }
        map.put(name,builer);
        return true;
    }
    public void construction(String name){
        Builer builer = map.get(name);
        //build 只能按照输入进行运作，无法窥视到全局
        builer.makeTitile("----------");
        builer.makeItem("builer item");
        builer.makeEndoFText("----------");
    }
}
