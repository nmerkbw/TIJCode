package com.jxs.chapeter16;

import com.jxs.chapeter13.Generator;

import java.util.LinkedHashMap;

public class MapData<K, V> extends LinkedHashMap<K, V> {

    // A single pair Genenrator:
    public MapData(Generator<Pair<K, V>> gen, int quantity) {

        for (int i = 0; i < quantity; i++) {

            Pair<K, V> p = gen.next();
            put(p.key, p.value);
        }
    }

    // Two separate Genenrators:
    public MapData(Generator<K> genK, Generator<V> genV, int quantity) {

        for (int i = 0; i < quantity; i++) {

            put(genK.next(), genV.next());
        }
    }

    // A key Genenrator and a single value:
    public MapData(Generator<K> genk, V value, int quantity) {

        for (int i = 0; i < quantity; i++) {

            put(genk.next(), value);
        }
    }

    // An  Iterable and a value Genenrator:
    public MapData(Iterable<K> genK, Generator<V> genV) {

        for (K key : genK) {

            put(key, genV.next());
        }
    }

    // An Iterable and a single value:
    public MapData(Iterable<K> genK, V value) {

        for (K k : genK) {

            put(k, value);
        }
    }

    // Generic convenience methods:
    public static <K, V> MapData<K, V> map(Generator<Pair<K, V>> gen, int quantity) {

        return new MapData<K, V>(gen, quantity);
    }

    public static <K, V> MapData<K, V> map(Generator<K> genK, Generator<V> genV, int quantity) {

        return new MapData<K, V>(genK, genV, quantity);

    }

    public static <K, V> MapData<K, V> map(Generator<K> genK, V value, int quantity) {

        return new MapData<K, V>(genK, value, quantity);
    }

    public static <K, V> MapData<K, V> map(Iterable<K> genk, Generator<V> genV) {

        return new MapData<K, V>(genk, genV);
    }

    public static <K, V> MapData<K, V> map(Iterable<K> genk, V value) {

        return new MapData<K, V>(genk, value);
    }
}

