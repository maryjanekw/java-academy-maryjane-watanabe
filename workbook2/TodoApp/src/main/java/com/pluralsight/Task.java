package com.pluralsight;

import java.time.LocalDate;

public class Task {

    // String title
    // Local date due date
    //reminder Yes or no (boolean)
    // boolean complete or incomplete
    //Urgency
    //String NotificationMessage

    //Instance variable
    // a variable linked to a Class/Object
    private String title;
    private LocalDate duedate;
    private boolean complete;
    private String urgency;
    private String NotificationMessage;
    private boolean Reminder;


    //Create a constructor
    public Task ( String _title){
        this.title = _title;
    }
    public Task (boolean markedCompleted){
        this.complete = markedCompleted;
    }

    // This controls how the task is printed:
    @Override
    public String toString() {
        if (complete) {
            return "[✓] " + title;
        } else {
            return "[ ] " + title;
        }
    }




}
