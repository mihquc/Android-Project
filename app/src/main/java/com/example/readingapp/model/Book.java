package com.example.readingapp.model;

import android.widget.ImageButton;

public class Book {
    private int id;
    private String author;
    private String category;
    private ImageButton ibBook;

    public Book(String author, String category, ImageButton ibBook) {
        this.author = author;
        this.category = category;
        this.ibBook = ibBook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ImageButton getIbBook() {
        return ibBook;
    }

    public void setIbBook(ImageButton ibBook) {
        this.ibBook = ibBook;
    }
}
