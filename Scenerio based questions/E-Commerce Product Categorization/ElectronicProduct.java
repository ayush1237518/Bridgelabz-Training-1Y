
package com.gla;
class ElectronicProduct extends Product {

    String brand;

    ElectronicProduct(int productId, String productName, String brand) {
        super(productId, productName);
        this.brand = brand;
    }

    boolean isMatch(String keyword) {
        return productName.contains(keyword) || brand.equalsIgnoreCase(keyword);
    }
}
