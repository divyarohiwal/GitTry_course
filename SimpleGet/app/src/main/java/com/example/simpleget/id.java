package com.example.simpleget;

public class id {
    private String userId;
    private String id;
    private String title;
    private String completed;

    public id(String userId, String id, String title, String completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public String getUserId() {
        return userId;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCompleted() {
        return completed;
    }


}
