
package com.gla;
class Product {

    int productId;
    String productName;

    Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    boolean isMatch(String keyword) {
        return productName.contains(keyword);
    }
}
