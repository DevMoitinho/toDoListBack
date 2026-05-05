package com.DevMoitinho.toDoList.model;

import jakarta.persistence.*;

/** Class for objects of type Task
 * @author João Moitinho
 * @version 1.05
 */

public class Task {

    private Long id;
    private String name;
    private String date;

    /**Contructor for the class 
     * @param name String
     * @param date String*/
    public Task(String name, String date) {
        this.name = name;
        this.date = date;
    }


    /**Method to return Task Name
     * @return String - Task name*/
    public String getName() {
        return this.name;
    }
    /**Method to set Task Name
     * @param name String*/
    public void setName(String name) {
        this.name = name;
    }


    /**Method to return Task date
     * @return String - Task date*/
    public String getDate() {
        return this.date;
    }
    /**Method to set Task Date
     * @param date String*/
    public void setDate(String date) {
        this.date = date;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return this.id;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        else if (!(obj instanceof Task)) {
           return false; 
        }
        else if (!((Task) obj).getName().equals(this.name)) {
            return false;
        }
        return true;
    }
}
