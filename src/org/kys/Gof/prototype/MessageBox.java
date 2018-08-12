package org.kys.Gof.prototype;

public class MessageBox implements Product {

    private char segmentation;

    public MessageBox(char segmentation) {
        this.segmentation = segmentation;
    }

    @Override
    public void use(String message) {
        printLine(message.length());
        System.out.println(this.segmentation + message + this.segmentation);
        printLine(message.length());
    }

    private void printLine(int length) {
        for (int a = 0; a < length + 2; a++) {
            System.out.print(this.segmentation);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        try {
            return (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
