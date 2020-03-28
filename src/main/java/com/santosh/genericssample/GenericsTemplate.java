package com.santosh.genericssample;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenericsTemplate {

    public static <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
        return Arrays.stream(a)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }

    // example of a generic method that has Number as an upper bound for T
    public static <T extends Number> List<T> fromArrayToListWithUpperBound(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    public static <T> void getForObject(T element) {
        System.out.println(element.getClass().getName() +
                " = " + element);
    }

    public static void addNumbers(List<? super Integer> list) {
        list.add(new Integer(50));
    }

    public static <T extends Comparable<T>> int compare(T t1, T t2) {
        return t1.compareTo(t2);
    }

    public static <T> boolean isEqual(WrapperType<T> g1, WrapperType<T> g2) {
        return g1.get().equals(g2.get());
    }
}
