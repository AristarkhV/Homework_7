package mateacademy.homework.homework_7;

import java.util.ArrayList;

public class Container<T, K> {

    private ArrayList<T> keys;
    private ArrayList<K> value;
    private int size;
    private K invalidValue = null;

    public Container() {
        keys = new ArrayList();
        value = new ArrayList();
    }

    private int getSize() {
        return this.size;
    }

    private int increaseSize() {
        return this.size++;
    }

    public K getValue(T key) {
        for (int i = 0; i < this.getSize(); i++) {
            if (this.keys.get(i) == key) {
                return this.value.get(i);
            }
        }
        return invalidValue;
    }

    public void putValue(K value, T key) {
        if (getSize() == 0) {
            this.keys.add(key);
            this.value.add(value);
            this.increaseSize();
        } else {
            for (int i = 0; i < this.getSize(); i++) {
                if (this.keys.get(i) == key) {
                    this.value.set(i, value);
                } else {
                    this.value.add(value);
                    this.keys.add(key);
                    this.increaseSize();
                }
            }
        }
    }
}
