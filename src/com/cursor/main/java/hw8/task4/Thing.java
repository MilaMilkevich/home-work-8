package com.cursor.main.java.hw8.task4;

public class Thing {
    private String name;
    private boolean isFragile;

    public Thing(String name, boolean isFragile){
        this.name=name;
        this.isFragile=isFragile;
    }
    public String getName(){
        return name;
    }

    public boolean isFragile() {
        return isFragile;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                ", isFragile=" + isFragile +
                '}';
    }
}
