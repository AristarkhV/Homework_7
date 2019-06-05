package mateacademy.homework.homework_7;

import java.util.Objects;

public class Pair<T, K> {

    private T firstValue;
    private K secondValue;

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


    public K getSecond() {
        return secondValue;
    }

    public T getFirst() {
        return firstValue;
    }

    @Override
    public int hashCode() {
        return (int) Math.PI * 31 * Objects.hash(firstValue, secondValue);
    }

    private Pair(T firstValue, K secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public static <T, K> Pair of(T t, K k) {
        Pair<T, K> pair = new Pair(t, k);
        return pair;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(T firstValue) {
        this.firstValue = firstValue;
    }

    public K getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(K secondValue) {
        this.secondValue = secondValue;
    }
}
