package com.cursor.main.java.hw8.task4;

import java.util.List;

public class Box {
    private List<Thing> boxWithThings;

    public Box(List<Thing> boxWithThings) {
        this.boxWithThings = boxWithThings;
    }

    public List<Thing> getBoxWithThings() {
        return boxWithThings;
    }
}
