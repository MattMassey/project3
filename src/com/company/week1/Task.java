package com.company.week1;

/**
 * Created by 016308 on 4/2/2019.
 */
class Task implements Comparable<Task>{
    private String title;
    private String description;
    private int priority; //0-5, 5 highest

    @Override
    public int compareTo(Task o) {
        int compare = 0;
        if (priority < o.priority) {
            compare = 1;
        } else if (priority == o.priority) {
            if (title.compareTo(o.title) == 1) {
                compare = 1;
            } else if (title.compareTo(o.title) == -1) {
                compare = -1;
            } else {
                compare = 0;
            }
        } else if (priority > o.priority) {
            compare = -1;
        }
        return compare;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "\ntitle='" + title + '\'' +
                ",\n description='" + description + '\'' +
                ",\n priority=" + priority +
                '}';
    }
}
