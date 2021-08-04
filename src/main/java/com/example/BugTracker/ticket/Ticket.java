package com.example.BugTracker.ticket;

public class Ticket {
    private Integer id;
    private String title;
    private String description;
    private String project;
    private String priority;

    public Ticket() {
    }

    public Ticket(Integer id, String title, String description, String project, String priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.project = project;
        this.priority = priority;
    }

    public Ticket(String title, String description, String project, String priority) {
        this.title = title;
        this.description = description;
        this.project = project;
        this.priority = priority;
    }

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
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", project='" + project + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }
}
