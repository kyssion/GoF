package org.kys.Gof.prototype;

public interface Product extends Cloneable{
    void use(String message);
    Product createClone();
}
