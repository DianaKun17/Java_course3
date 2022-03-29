package lesson1;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("C");
        //task1(array);

        int[] a = {1, 5, 6, 8, 3, 5, 5, 4};
        task2(a);
    }

    public static void task1 (ArrayList arrayList) {
        System.out.println("Начальный массив: ");
        System.out.println(arrayList);

        Object o = new Object();
        Object e = new Object();
        o = arrayList.get(0);
        e = arrayList.get(2);

        arrayList.remove(0);
        arrayList.remove(2);
        arrayList.add(0, e);
        arrayList.add(2, o);

        System.out.println("Измененный массив:");
        System.out.println(arrayList);
    }

    public static void task2 (int[] a){
        //Как в данный метод передавать не только int[] массивы? Пробовала передавать var[] a, но выдавал ошибку
        System.out.println("Массив: " + Arrays.toString(a));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            arrayList.add(i,a[i]);
        }
        System.out.println("ArrayList: " + arrayList);
    }
}
