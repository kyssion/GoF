package org.kys.Gof.prototype;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        Product box1 = new MessageBox('~');
        Product box2 = new MessageBox('*');
        Product box3 = new UnderLinerBox('-');

        message.register("~",box1);
        message.register("*",box2);
        message.register("-",box3);

        Product boxx1 = message.create("~");
        Product boxx2 = message.create("*");
        Product boxx3 = message.create("-");

        System.out.println(box1+" "+boxx1);
        System.out.println(box2+" "+boxx2);
        System.out.println(box3+" "+boxx3);

        boxx1.use("hello world");
        boxx2.use("hello world");
        boxx3.use("hello world");
    }
}