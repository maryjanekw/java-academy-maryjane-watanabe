package com.pluralsight;


public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to your Todo App!");

        Task[] tasks = new Task[3];

        tasks[0] = new Task("Learn the basics of Classes and Methods in Java");
        tasks[1] = new Task("Fill out this Year Up online form.");
        tasks[2] = new Task("Share your most fun exercise we did in class");

        tasks[1].markedCompleted;
    }
}