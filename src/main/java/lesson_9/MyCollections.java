package org.brit.lesson9;

import java.util.*;

public class MyCollections {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(6);
        list.add(-10);

        System.out.println(list);

        list.add(33);

        System.out.println(list);

        list.add(0, -22);

        System.out.println(list);

        list.set(2, 10);

        System.out.println(list);

        list.remove(3);

        System.out.println(list);

        System.out.println(list.size());

        List<Integer> list1 = List.of(3, 5, -99, 10, 15, 5, -99);

        list.addAll(list1);

        System.out.println(list);

        List<Integer> subList = list.subList(2, 6);

        System.out.println(subList);

       // list.sort(Comparator.naturalOrder());

        System.out.println(list);

        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println();

        for (Integer integer : list) {
            System.out.println(integer);
        }

        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        System.out.println(list);
        System.out.println(set);


    }
}
