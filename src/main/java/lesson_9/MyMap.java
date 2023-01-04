package org.brit.lesson9;

import java.util.*;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Bryt S.V.", 30);
        map.put("Melnykova Y.", 22);
        map.put("Vasiliev R.", 25);
        map.put("Korzh R.", 22);

        System.out.println(map);

        map.put("Bryt S.V.", 40);

        System.out.println(map);

        Integer i = map.get("Shyshko K.");
        System.out.println(i);

        map.put("Shyshko K.", 30);

        System.out.println(map);

        map.remove("Shyshko K.");

        System.out.println(map);

        Set<String> strings = map.keySet();
        Collection<Integer> values = map.values();

        System.out.println(strings);
        System.out.println(values);

        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }

        System.out.println();

        for (Integer val: map.values()){
            System.out.println(val);
        }

        System.out.println();
        System.out.println();

        Map<Integer, List<String>> map1 = new HashMap<>();

        List<Map<String, Object>> users = new ArrayList<>();

        Map<String, Object> user = new HashMap<>();
        user.put("Name", "Serhii");
        user.put("LastName", "Bryt");
        user.put("Age", 40);

        users.add(user);

        user = new HashMap<>();
        user.put("Name", "Kateryna");
        user.put("LastName", "Shyshko");
        user.put("Age", 25);

        users.add(user);

        user = new HashMap<>();
        user.put("Name", "Roman");
        user.put("LastName", "Korzh");
        user.put("Age", 30);

        users.add(user);

        user = new HashMap<>();
        user.put("Name", "Roman");
        user.put("LastName", "Kobzar");
        user.put("Age", 39);

        users.add(user);

        System.out.println(users);


        for (Map<String, Object> user1: users){
            System.out.println("User: ");
            System.out.println("Name: " + user1.get("Name"));
            System.out.println("Last name: " + user1.get("LastName"));
            System.out.println("Age: " + user1.get("Age"));
            System.out.println();
        }

        String name = "Roman";

        for (Map<String, Object> user1: users){
            if (user1.get("Name").equals("Roman")){
                System.out.println("User: ");
                System.out.println("Name: " + user1.get("Name"));
                System.out.println("Last name: " + user1.get("LastName"));
                System.out.println("Age: " + user1.get("Age"));
                System.out.println();
            }
        }


        List<String> list = List.of("5", "Plus", "-5");





    }
}
