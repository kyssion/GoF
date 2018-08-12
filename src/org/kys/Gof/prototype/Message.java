package org.kys.Gof.prototype;

import java.util.HashMap;

public class Message {
    private HashMap<String,Product> showcase =
            new HashMap<>();
    public void register(String name,Product o){
        showcase.put(name,o);
    }
    public Product create(String name){
        return showcase.get(name).createClone();
    }
}
