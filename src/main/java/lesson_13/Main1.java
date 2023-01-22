package lesson_13;

//import selenium.WebDriver;
//import selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Serhii", "Bryt"));
        users.add(new User("Svitlana", "Voronko"));
        users.add(new User("Olexa", "Voron"));

        List<Integer> integers = new ArrayList<>(List.of(1, 4, 6, 15, -8));

        //  Collections.sort(users);
        Collections.sort(integers);
        System.out.println(integers);

        Collections.sort(users);
        System.out.println(users);

    }
}
