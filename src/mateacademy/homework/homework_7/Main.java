package mateacademy.homework.homework_7;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!

        Container<String, String> storage = new Container();
        storage.putValue("one", "box1");
        System.out.println(storage.getValue("box1"));
        storage.putValue("four", "box4");
        System.out.println(storage.getValue("box4"));
        storage.putValue("two", "box2");
        System.out.println(storage.getValue("box2"));
        storage.putValue("...", "box2");
        System.out.println(storage.getValue("box2"));
    }
}
