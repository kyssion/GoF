package org.kys.Gof.FactoryMethod;

public class BookFactory implements Factory{
    @Override
    public Product create(IDcard iDcard) {
        return new BookProduct(iDcard);
    }

}
