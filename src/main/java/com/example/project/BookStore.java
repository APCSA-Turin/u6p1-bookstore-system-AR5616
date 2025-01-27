package com.example.project;

public class BookStore {

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book[] books = new Book[0];
    private User[] users = new User[10];

    //requires 1 empty constructor
    public BookStore() {}

    // Getter method; returns the array users
    public User[] getUsers() {
        return users;
    }

    // Setter method; sets the array users to array newUser
    public void setUsers(User[] newUsers) {
        users = newUsers;
    }

    // Getter method; returns the array books
    public Book[] getBooks() {
        return books;
    }

    // adds a User to the users array
    public void addUser(User user) {
        // a for loop is initialized to find an empty space to instill the user into
        for (int i = 0; i < users.length; i++) {
            // when an empty space is found the user is put in that space
            if (users[i] == null) {
                users[i] = user;
                // the consolidateUsers method is used to make sure the array is in proper form
                consolidateUsers();
                // return is used in order to end the for loop after the user is successfully added
                return;
            }
        }
    } 

    // removes a User from the user array
    public void removeUser(User user) {
        // a for loop is initalized to go through every user in order to find the user that is desired to be deleted
        for (int i = 0; i < users.length; i++) {
            // once the user is found, it is set to null and consolidateUsers is called to keep the array in proper form, return stops the loop
            if (users[i] == user) {
                users[i] = null;
                consolidateUsers();
                return;
            }
        }
    }

    // this method keeps the users array in proper form, ensuring no spaces between users
    public void consolidateUsers() {
        int emptyIndex = 0;
        for (int i = 0; i < users.length; i++) {
            // shifting users to the left in accordance to how many empty indexes there are
            if (users[i] != null) {
                if (i != emptyIndex) {
                users[emptyIndex] = users[i];
                // the original position is set to null
                users[i] = null;
                }
                // emptyIndex has 1 added to ensure each user is shifted as far as possible
                emptyIndex++;
            }
        }
    }

    // adds a book to the books array
    public void addBook(Book book) {
        // creates a new Book array called newBook with one more array space than the original array
        Book[] newBook = new Book[books.length + 1];
        // sets newBook to the original array using a for loop, each element of books is added to newBook in the same order
        for (int i = 0; i < books.length; i++) {
            newBook[i] = books[i];
        }
        // adds on the desired book to the end of newBook
        newBook[books.length] = book;
        // sets the original array to newBook, successfully adding the desired book to the original array
        books = newBook;
    }

    // inserts a book at the desired index in the books array
    public void insertBook(Book book, int index) {
        // creates a new Book array called newBook with one more array space than the original
        Book[] newBook = new Book[books.length + 1];
        // a for loop is executed to copy all of the elements before the index where the book is set to be inserted at
        for (int i = 0; i < index; i++) {
            newBook[i] = books[i];
        }
        // another for loop is executed to properly shift all of the elements that come after the index
        for (int i = index + 1; i < books.length + 1; i++) {
            newBook[i] = books[i - 1];
        }
        // inserting the book at the desired index
        newBook[index] = book;
        // setting the original array to the new array
        books = newBook;
    }

    // removes a book completely from the books array if its quantity is one, if there are multiple it decreases the books quantity by one
    public void removeBook(Book book) {
        int bookIndex = 0;
        // a for loop is executed to find the index where the book to be removed is
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book) {
                bookIndex = i;
            }
        }
        // checking if the book to be removed has a quantity of one
        if (books[bookIndex].getQuantity() == 1) {
            // creating a new array with one less element than the original
            Book[] newBook = new Book[books.length - 1];
            // copying each book before the index to the new array utilizing a for loop
            for (int i = 0; i < bookIndex; i++) {
                newBook[i] = books[i];
            }
            // copying each book after the index utilizing a for loop
            for (int i = bookIndex + 1; i < books.length; i++) {
                newBook[i - 1] = books[i];
            }
            // setting the original array to the new array
            books = newBook;
        } else {
            // decreasing the books quantity by one because there are multiple
            books[bookIndex].setQuantity(books[bookIndex].getQuantity() - 1);
        }
    }
    
    // returning a String with information about all of the books in bookStore
    // the information is acquired using the bookInfo method
    public String bookStoreBookInfo() {
        String bookStoreBookInfo = "";
        // a for loop is utilized to go through the entire array
        for (int i = 0; i < books.length; i++) {
            // adding each books info to the String
            bookStoreBookInfo += books[i].bookInfo();
        }
        return bookStoreBookInfo;
    }

    // returning a String with info about all the users in bookStore
    // the information is acquired using the userInfo method
    public String bookStoreUserInfo() {
        String bookStoreUserInfo = "";
        // a for loop is utilized to go through the entire array
        for (int i = 0; i < users.length; i++) {
            // adding each users info to the String
            bookStoreUserInfo += users[i].userInfo();
        }
        return bookStoreUserInfo;
    }
}