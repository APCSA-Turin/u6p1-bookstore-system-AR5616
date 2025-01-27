package com.example.project;

public class User {
    // requires 3 private attributes String name, String Id, Book book that is initialized to empty
    private String name;
    private String Id;
    private Book[] books = new Book[5];

    //requires 1 contructor with two parameters that will initialize the name and id
    public User (String name, String Id) {
        this.name = name;
        this.Id = Id;
    }

    // Getter method; returns the name of the User
    public String getName() {
        return name;
    }

    // Setter method; sets the name of the User to newName
    public void setName(String newName) {
        name = newName;
    }

    // Getter method; returns the Id of the User
    public String getId() {
        return Id;
    }

    // Setter method; sets the Id of the User to newId
    public void setId(String newId) {
        Id = newId;
    }

    // Getter method; returns the array of Books
    public Book[] getBooks() {
        return books;
    }

    // Setter method; sets the array of Books to newBooks
    public void setBooks(Book[] newBooks) {
        books = newBooks;
    }

    // returns a String with all of the book information for the user
    public String bookListInfo() {
        String bookListInfo = "";
        // a for loop is executed to go through the entire list
        for (int i = 0; i < books.length; i++) {
            // checks if any of the indexes are empty
            // empty is added to the list info to indicate an empty slot
            if (books[i] == null) {
                bookListInfo += "empty\n";
            } else {
            // adds the info of the book to the String if the slot is not empty
                bookListInfo += books[i].bookInfo() + "\n";
            }
        }
            return bookListInfo;
    }

    // returns all of the Users info including their name, ID, and books
    public String userInfo() {
        return "Name: " + name + "\nId: " + Id + "\nBooks: \n" + bookListInfo();
    }    
}