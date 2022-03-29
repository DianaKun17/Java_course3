package lesson1;

import java.util.ArrayList;

public class MainForTask3 {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Apple> box3 = new Box<>();

        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());

        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());

        System.out.println(box1.getWeight(box1));
        System.out.println(box2.getWeight(box2));
        System.out.println(box1.compare(box2));

        box1.doEmpty(box3);
        System.out.println(box3.getWeight(box3));
        System.out.println(box1.getWeight(box1));

    }
}
