package com.company.week1;

import java.util.ArrayList;

/**
 * Created by 016308 on 4/2/2019.
 */
public class TaskCollection {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String name, String desc, int pri) {
        Task newTask = new Task();
        newTask.setTitle(name);
        newTask.setDescription(desc);
        newTask.setPriority(pri);
        tasks.add(newTask);
    }

    public void removeTask(String taskName) {
        for (Task o : tasks) {
            if (o.getTitle().equalsIgnoreCase(taskName)) {
                tasks.remove(o);
            }
        }
    }

    public void changeTask(String taskName, String taskDescription) {
        for (Task o : tasks) {
            if (o.getTitle().equalsIgnoreCase(taskName)) {
                o.setDescription(taskDescription);
            }
        }
    }

    public void listTasks(int priority) {
        try {
            for (Task o : tasks) {
                if (o.getPriority() == priority) {
                    System.out.println(o);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
