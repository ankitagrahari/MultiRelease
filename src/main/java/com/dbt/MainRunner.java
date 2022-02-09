package com.dbt;

public class MainRunner {

    public static void main(String[] args) {

        Worker worker = new Worker();
        if(!worker.isNameBlank())
            System.out.println(worker.getName()+"---"+worker.getVersion());
        else
            System.out.println("Name is Blank");

    }

}
