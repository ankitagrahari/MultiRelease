package com.dbt;

import java.time.LocalDate;
import java.time.LocalDateTime;

@FunctionalInterface
interface FunctionOne{
    int addTwoNum(int a, int b);
}

public class Worker {

    private int version = 8;
    private String name = "Worker8";

    public boolean isNameBlank(){
        FunctionOne total = (a, b) -> a+b;
        System.out.println("Sum of 10, 20 is ="+ total.addTwoNum(10, 20));

        return this.name == null || this.name.trim().isEmpty();
    }

    public String getName(){
        return this.name;
    }

    public int getVersion(){
        return this.version;
    }
}
