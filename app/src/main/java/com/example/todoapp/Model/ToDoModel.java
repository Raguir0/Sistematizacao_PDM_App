package com.example.todoapp.Model;

import androidx.annotation.NonNull;

public class  ToDoModel {

    private String task;
    private int id , status;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @NonNull
    @Override
    public  String toString(){
        return "ToDoModel{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", status=" + status +
                '}';
    }
}
