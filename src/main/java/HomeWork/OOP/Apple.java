package HomeWork.OOP;

import java.util.Objects;

public class Apple extends Computer {



    public Apple (String brand){
        super(brand);
    }
    public long sleepTime;


    @Override
    public String keybord() {
        return "Apple Magic KeyBord";
    }

    @Override
    public void display() {
// super shows result of Display from  Computer method
//        super.display();
        System.out.println("Apple Retina display");
    }

    public long getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(long sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "sleepTime=" + sleepTime +
                '}' + super.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apple apple = (Apple) o;
        return sleepTime == apple.sleepTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sleepTime);
    }
}
