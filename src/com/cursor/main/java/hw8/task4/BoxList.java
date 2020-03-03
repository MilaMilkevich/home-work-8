package com.cursor.main.java.hw8.task4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxList {

    public static List<Box> buildBoxList() {
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box(Arrays.asList(new Thing("pen", false), new Thing("vase", true))));
        boxes.add(new Box(Arrays.asList(new Thing("book", false), new Thing("plate", true))));
        boxes.add(new Box(Arrays.asList(new Thing("glasses", true), new Thing("mirror", true))));;
        return boxes;
    }

    List<Box> boxesList=buildBoxList();
    List<Box> boxes=boxesList.stream()
    .map(box -> box.getThings().stream()).peek(thing -> System.out.println(thing.toString()));


}
