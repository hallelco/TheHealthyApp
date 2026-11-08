package com.example.thehealthyapp;

public  abstract class Entry
{
    private int id;
    private String date;
    private String type;

    public Entry(int id, String date, String type) {
        this.id = id;
        this.date = date;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }
}
