package com.jooyunghan.java8;

public class Pair<T, S> {
    public T _1;
    public S _2;

    public Pair(T t, S s) {
        _1 = t;
        _2 = s;
    }

    public static <T,S> Pair<T,S> pair(T t, S s) {
        return new Pair<>(t,s);
    }
}
