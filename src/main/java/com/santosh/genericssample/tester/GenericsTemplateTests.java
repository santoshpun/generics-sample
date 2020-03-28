package com.santosh.genericssample.tester;

import com.santosh.genericssample.GenericsTemplate;
import com.santosh.genericssample.OrderedPair;
import com.santosh.genericssample.Partition;
import com.santosh.genericssample.WrapperType;
import com.santosh.genericssample.app.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenericsTemplateTests {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }

    public static void test1() {
        WrapperType<String> g1 = new WrapperType<>();
        g1.set("demo");

        WrapperType<String> g2 = new WrapperType<>();
        g2.set("demo");

        boolean isEqual = GenericsTemplate.isEqual(g1, g2);

        System.out.println("===== test1 result =======");
        System.out.println(isEqual);
    }

    public static void test2() {
        System.out.println("===== test2 result =======");
        System.out.println(GenericsTemplate.compare("santosh", "santosh"));
    }

    public static void test3() {
        System.out.println("===== test3 result =======");
        OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
        System.out.println(p1.getKey() + ":" + p1.getValue());

        OrderedPair<String, String> p2 = new OrderedPair<>("hello", "world");
        System.out.println(p2.getKey() + ":" + p2.getValue());
    }

    public static void test4() {
        String[] items = {"abc", "bcd"};
        List<String> list = GenericsTemplate.fromArrayToList(items);
        list.forEach(s -> System.out.println(s));
    }

    public static void test5() {
        User user1 = new User(1, "Santosh");
        User user2 = new User(2, "John");

        User[] users = Stream.of(
                user1,
                user2
        ).toArray(User[]::new);

        List<User> list = GenericsTemplate.fromArrayToList(users);
        list.forEach(s -> System.out.println(s));
    }

    public static void test6() {
        List<String> items = Stream.of("apple", "banana", "grapes")
                .collect(Collectors.toList());

        Partition<String> parts = Partition.ofSize(items, 2);
        System.out.println(parts);
    }
}
