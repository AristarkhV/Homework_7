package mateacademy.homework.homework_7;

public class Container<T, K> {

    private T[] key;
    private K[] value;
    private int keyLength = key.length;
    private K invalidValue = null;

    public Container(T[] key, K[] value) {
        for (int i = 0; i < keyLength; i++) {
            this.key[i] = key[i];
            this.value[i] = value[i];
        }
    }

    public K getValue(T key) {
        for (int i = 0; i < keyLength; i++) {
            if (key == this.key[i]) {
                return this.value[i];
            }
        }
        return invalidValue;
    }

    public void setValue(K value, T key) {
        for (int i = 0; i < keyLength; i++) {
            if (this.key[i] == key) {
                this.value[i] = value;
            }
        }
    }
}
