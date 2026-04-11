
package com.gla.generics-collections;

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T f, U s) { first = f; second = s; }

    public T getFirst() { return first; }
    public U getSecond() { return second; }
}
