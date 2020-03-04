package com.cursor.main.java.hw8.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BoxList {

    public static List<Box> buildBoxList() {
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box(Arrays.asList(new Thing("pen", false), new Thing("vase", true))));
        boxes.add(new Box(Arrays.asList(new Thing("book", false), new Thing("plate", true))));
        boxes.add(new Box(Arrays.asList(new Thing("glasses", true), new Thing("mirror", true))));
        return boxes;
    }

    public void addExtraPacking() {
        List<Box> boxesList = buildBoxList();
        List<Protector> protectorThings = boxesList.stream()
                .flatMap(box -> box.getBoxWithThings().stream())
                .filter(Thing::isFragile)
                .map(Protector::new)
                .collect(Collectors.toList());
        System.out.println(protectorThings);
    }
}
