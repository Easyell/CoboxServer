package com.jeasyell.easyell.model;

public class Process {
    private Integer id;

    private String title;

    private String description;

    private String tasks;

    private String colors;

    private Integer posterid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks == null ? null : tasks.trim();
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors == null ? null : colors.trim();
    }

    public Integer getPosterid() {
        return posterid;
    }

    public void setPosterid(Integer posterid) {
        this.posterid = posterid;
    }
}