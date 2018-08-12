package org.kys.Gof.builder;

public abstract class Builer<T> {
    public abstract void makeTitile(String title);
    public abstract void makeItem(String item);
    public abstract void makeEndoFText(String end);
    public abstract T getResult();
}
