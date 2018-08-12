package org.kys.Gof.builder;

public class Main {
    public static void main(String[] args) {
        Builer textBuiler = new TextBuilder();
        Builer htmlBuiler = new HtmlBuiler();
        Director director = new Director();
        director.setBuiler("text",textBuiler);
        director.setBuiler("html",htmlBuiler);

        director.construction("text");
        director.construction("html");

        System.out.println(textBuiler.getResult());
        System.out.println(htmlBuiler.getResult());
    }
}