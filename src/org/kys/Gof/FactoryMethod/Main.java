package org.kys.Gof.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Factory factory = new BookFactory();
        Product product1= factory.create(new IDcard("美容卡","tom"));
        Product product2= factory.create(new IDcard("购物卡","jack"));
        product1.use();
        product2.use();
    }
}
