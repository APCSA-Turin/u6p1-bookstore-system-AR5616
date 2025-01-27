package com.example.project;

public class IdGenerate { //This class contains statics variable and methods, you do not initalize an object to use it.
    
    // //requires 1 private attribute String currentId. You must initialize it to 99
    private static String currentId = "99";

    // //requires one empty constructor
    public IdGenerate() {}

    // Getter method; returns the current ID
    public static String getCurrentId() {
        return currentId;
    }

    // resets the ID back to its original value of 99
    public static void reset() {
        currentId = "99";
    } 

    //generates a new id, when called it will increment the currentId by 1.. Hint pay attention to data type of currentId
    public static void generateID() {
        // converting the String to an int so that it can be added to
        int currentIdInt = Integer.parseInt(currentId);
        // adding 1 to the ID
        currentIdInt++;
        // storing it back in the currentId variable and making it a String
        currentId = "" + currentIdInt;
    } 
}