package com.example.project;

public class Book {
    //requires 5 attributes String title, String author, int yearPublished, String isbn, int quantity
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;

    //requires 1 constructor with 5 arguments that intitialize the attribtues of the class.
    public Book(String title, String author, int yearPublished, String isbn, int quantity) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    // Getter method; returns the title of the Book
    public String getTitle() {
        return title;
    }

    // Setter method; sets the title of the Book to newTitle
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    // Getter method; returns the author of the Book
    public String getAuthor() {
        return author;
    }

    // Setter method; sets the author of the Book to newAuthor
    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    // Getter method; returns the year the Book was published
    public int getYearPublished() {
        return yearPublished;
    }

    // Setter method; sets the year the Book was published to newYear
    public void setYearPublished(int newYear) {
        yearPublished = newYear;
    }

    // Getter method; returns the isbn of the Book
    public String getIsbn() {
        return isbn;
    }

    // Setter method; sets the isbn of the Book to newIsbn
    public void setIsbn(String newIsbn) {
        isbn = newIsbn;
    }

    // Getter method; returns the quantity of the Book
    public int getQuantity() {
        return quantity;
    }

    // Setter method; sets the quantity of the Book to newQuantity
    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    // returns info about the Book including the title, author, year published, isbn, and quantity
    public String bookInfo() {
        return ("Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", ISBN: " + isbn + ", Quantity: " + quantity);
    }
}