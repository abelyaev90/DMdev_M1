package com.dmdev.week5.practics.generics.task1;

/**
 * Задача 1
 * Создать класс Pair, параметризованный двумя параметрами K и V.
 * Класс должен хранить две переменные типов K и V соответственно.
 * У класса должен быть конструктор, принимающий 2 параметра типов K и V,
 * а также набор соответствующих геттеров/сеттеров, toString (для отображения состояния текущего объекта типа Pair)
 */

public class Pair<K, V> {

    private K k;
    private V v;

    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "Pair{" +
               "k=" + k +
               ", v=" + v +
               '}';
    }
}
