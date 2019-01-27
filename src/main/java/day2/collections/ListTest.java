package day2.collections;

import day1.sorting.Car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    List<String> arrayList;
    List<String> linkedList;

    public void addToList(int index) {
        arrayList = new ArrayList<>(index);

        for (int i = 0; i < index; i++) {
            arrayList.add("Przykładowy string " + i);

        }
        linkedList = new LinkedList<>();
    }

    public void checkTimeAddElement(int index, String element) {
        long start1 = System.currentTimeMillis();
        arrayList.add(index, element);
        long stop1 = System.currentTimeMillis();
        System.out.println("ArrayList time " + (stop1 - start1));
        List<String> linkedList = new LinkedList<>(arrayList);

        long start2 = System.currentTimeMillis();
        arrayList.add(index, element);
        long stop2 = System.currentTimeMillis();
        System.out.println("LinkedList time " + (stop2 - start2));
    }

    public void getElement(int index) {
        long start1 = System.currentTimeMillis();
        System.out.println(arrayList.get(index));
        long stop1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        System.out.println(linkedList.get(index));
        long stop2 = System.currentTimeMillis();

        System.out.println("ArrayList time " + (stop1 - start1));
        System.out.println("LinkedList time " + (stop2 - start2));
    }

//    public void checkElement(int index, String element1) {
//        long start1 = System.currentTimeMillis();
//        System.out.println(arrayList.get(element1));
//        long stop1 = System.currentTimeMillis();
//
//        long start2 = System.currentTimeMillis();
//        System.out.println(linkedList.get(element1));
//        long stop2 = System.currentTimeMillis();
//
//        System.out.println("ArrayList time " + (stop1 - start1));
//        System.out.println("LinkedList time " + (stop2 - start2));
//    }
    public void checkHashCode(int index){
        List<Car> carList = new ArrayList<>(index);
        for (int i = 0; i < index; i++) {
            carList.add(new Car("red"+ i, "samochod"+i, 256, 120000, "producent" +i));
        }

        Car car = new Car("red900000", "samochod900000", 899, 987000, "jag900000");
        System.out.println(car);
        long start1 = System.currentTimeMillis();
        System.out.println(carList.contains(car));
        long stop1 = System.currentTimeMillis();

        System.out.println("AcarList time " + (stop1 - start1));
    }


    public static void main(String[] args) {
        ListTest listTest = new ListTest();
//        listTest.addToList(10_000_000);
//        listTest.checkTimeAddElement(50, "nasz element ");
//        listTest.checkElement("Przykładowy string 5 000 000");
        listTest.checkHashCode(100_000);
    }

}
