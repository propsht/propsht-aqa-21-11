package lesson_13;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Zeus");
        Animal cat1 = new Cat("Murka");
        cat1.setLegs(3);
        cat.walk();
        System.out.println(cat.equals(cat1));

        System.out.println(cat);

        System.out.println(cat.getName());
        Animal dog = new Dog("Sirko");
        dog.walk();
        System.out.println(dog.getName());

        System.out.println(cat.equals(dog));

        Main main = new Main();
        main.method1();

    }

    public void method1() {
        System.out.println("Method 1");
    }

    public void method2() {
        System.out.println("Method 2");
    }

}
