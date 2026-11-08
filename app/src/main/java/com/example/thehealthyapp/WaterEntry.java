package com.example.thehealthyapp;

public class WaterEntry extends Entry
{
    private int amountMl;

    public WaterEntry(int id, String date,String type,int amountMl){
        super(id,date,type);
        this.amountMl = amountMl;
    }

    public int getAmountMl() {
        return amountMl;
    }

    public void setAmountMl(int amountMl) {
        this.amountMl = amountMl;
    }

    public void addWater(int newWater)
    {
        this.amountMl += newWater;
    }
}
