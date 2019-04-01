package edu.dmacc.codedsm.hw14;

import java.util.List;

public class User {
    private String name;
    private String title;
    private List<Task> Task;
    private boolean isActive;

    public User(String name, String title, List<Task> Task, boolean isActive) {
        this.name = name;
        this.title = title;
        this.Task = Task;
        this.isActive = isActive;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        this.isActive = isActive;
    }

    public void setAssignedTask(List<Task> task) {
        Task = task;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", AssignedTask=" + Task +
                ", active=" + isActive +
                '}';
    }
}

