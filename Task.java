/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task;

/**
 *
 * @author nkomo
 */
public class Task {
    private String taskName;
    private int taskId;
    private int taskWage;
    
    public Task(String name, int id, int wage) {
        this.taskName = name;
        this.taskId = id;
        this.taskWage = wage;
    }
    
    public String getTaskName() {
        return taskName;
    }
    
    public int getTaskId() {
        return taskId;
    }
    
    public int getTaskWage() {
        return taskWage;
    }
}
