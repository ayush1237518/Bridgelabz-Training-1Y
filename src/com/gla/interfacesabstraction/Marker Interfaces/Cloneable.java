
package com.gla.interfaces-abstraction;

class Product implements Cloneable {

    int id;

    Product(int id) {
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
