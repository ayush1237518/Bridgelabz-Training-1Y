package abstraction;

abstract class Car implements Vehicle {

    abstract void brand();

    void wheels() {
        System.out.println("4 wheels");
    }
}