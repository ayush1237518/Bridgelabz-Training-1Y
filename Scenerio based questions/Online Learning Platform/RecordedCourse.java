
package com.gla;
class RecordedCourse extends Course {

    RecordedCourse(int id, String name, double price) {
        super(id, name, price);
    }

    double getFinalPrice() {
        return price - (price * 0.10);
    }
}
