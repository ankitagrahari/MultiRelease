package com.dbt;

public class Worker {

    private int version = 11;
    private String name = "Worker11";

    public boolean isNameBlank(){
        return this.name.isBlank();
    }

    public String getName(){
        return this.name.stripLeading();
    }

    public int getVersion(){
        return this.version;
    }
}
