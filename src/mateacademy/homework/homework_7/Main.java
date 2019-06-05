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

        String[] stringValue = {"one", "two", "three"};
        Integer[] keys = {1, 2, 3};
        Container<Integer, String> storage = new Container(keys, stringValue);

        System.out.println(storage.getValue(1));
    }
}
