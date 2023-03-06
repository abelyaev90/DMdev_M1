package com.dmdev.week5.practics.generics.task1;

/**
 * Задача 2
 * Создать статический обобщённый метод swap в утилитном классе PairUtil
 * (утилитный класс – это класс только со статическими методами, который
 * имеет private конструктор и помечен ключевым словом final, чтобы предотвратить
 * создание объектов этого класса, а также наследоваться от него).
 * <p>
 * Метод должен принимать объект класса Pair и возвращать новый объект Pair, в которой элементы поменяны местами.
 */

public class PairUtil {

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        K k = pair.getK();
        V v = pair.getV();
        Pair<V,K> newPair = new Pair<>(v, k);
        return newPair;
    }

    private PairUtil() {
    }
}
