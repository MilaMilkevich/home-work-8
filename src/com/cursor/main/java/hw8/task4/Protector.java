package com.cursor.main.java.hw8.task4;

public class Protector {
    private Thing thing;

    public Protector(Thing thing){
        this.thing=thing;
    }

    public Thing getThing() {
        return thing;
    }

    @Override
    public String toString() {
        return "Protector{" +
                "thing=" + thing +
                '}';
    }
}

