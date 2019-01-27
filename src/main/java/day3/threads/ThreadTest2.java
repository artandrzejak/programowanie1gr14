package day3.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest2 {
    static int a = 0;
    static boolean d = true;
    List<Integer> elementList = new ArrayList<>();


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start ");
        new Thread(ThreadTest2::method).start();
        new Thread(ThreadTest2::method).start();
        Thread.sleep(10000);
        System.out.println(" End");
    }

    public static void method() {
        try {
            while (d) {
                a++;
                System.out.print(a + " ");
                Thread.sleep(100);
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void addElement (int a){

        System.out.println("Początek ");

        synchronized (elementList) {
            elementList.add(a);
        }
        System.out.println(" Koniec");
    }
}
