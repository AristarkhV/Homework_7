package mateacademy.homework.homework_7;

import java.util.Objects;

public class Pair<T, K> {

    private T firstValue;
    private K secondValue;

    private Pair() {
    }

    public K getSecond() {
        return secondValue;
    }

    public T getFirst() {
        return firstValue;
    }

    public static <T, K> Pair of(T t, K k) {
        Pair<T, K> pair = new Pair(t, k);
        return pair;
    }

    @Override
    public int hashCode() {
        return (int) Math.PI * 31 * Objects.hash(firstValue, secondValue);
    }

    private Pair(T firstValue, K secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) object;
        return Objects.equals(firstValue, pair.firstValue) &&
                Objects.equals(secondValue, pair.secondValue);
    }
}
