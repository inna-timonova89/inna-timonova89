package ru.job4j.collection;

import com.sun.source.doctree.SeeTree;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSort {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);

        Set<Integer> numbers1 = new TreeSet<>(Collections.reverseOrder());
        numbers1.add(4);
        numbers1.add(2);
        numbers1.add(6);
        System.out.println(numbers1);
    }
}
