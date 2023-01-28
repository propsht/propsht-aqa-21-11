package HomeWork.OOP;

public class Main {

    public static void main(String[] args) {

        Computer apple = new Apple("Apple");
        Computer apple1 = new Apple("Apple1");
        apple.display();
        apple.keybord();

        System.out.println(apple);
        System.out.println(apple.equals(apple1));

        Computer dell = new Dell("DeLL");
        dell.display();
        dell.keybord();
        System.out.println(dell.getBrand());
        System.out.println(apple.getBrand());




    }
}
