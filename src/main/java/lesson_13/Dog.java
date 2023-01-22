package lesson_13;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Woof!!!";
    }
}
