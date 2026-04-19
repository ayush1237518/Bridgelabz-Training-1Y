package com.gla;

public class Book {
    private final int id;
    private final String name;
    private final String author;
    private boolean isIssued;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println(id + " | " + name + " | " + author);
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    @Override
    public String toString() {
        return name + " " + author;
    }
}