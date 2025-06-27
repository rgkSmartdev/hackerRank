package org.smartdev.streams;

import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        Stream<Integer> intList = Stream.of(1,2,3,4,5,6,7,8,9,10);

        intList
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .forEach(System.out::println);
        Stream<Integer> intList2 = Stream.of(2,4,6,8,10);
        int sum = intList2.map(i -> i * i).reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
