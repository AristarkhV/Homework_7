package mateacademy.homework.homework_7;

import java.util.Arrays;

public class Container<T, K> {

    private T[] key;
    private K[] value;
    private int size;
    private K invalidValue = null;

    public Container(T[] key, K[] value, int size) {
        for (int i = 0; i < this.getSize(); i++) {
            this.key[i] = key[i];
            this.value[i] = value[i];
        }
        size = this.size;
    }

    public K getValue(T key) {
        for (int i = 0; i < this.getSize(); i++) {
            if (key == this.key[i]) {
                return this.value[i];
            }
        }
        return invalidValue;
    }

    public void setValue(K value, T key) {
        for (int i = 0; i < this.getSize(); i++) {
            if (this.key[i] == key) {
                this.value[i] = value;
            }
        }
    }

    private int getSize() {
        return size;
    }
}
