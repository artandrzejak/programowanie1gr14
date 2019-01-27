package day2.generic;

import day1.sorting.Car;
import day2.fluency.Settings;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Lista<String> lista = new Lista<>();
//        lista.addElement("Treść listy");
//        lista.addElement("Mięso");
//
//        String s = lista.getElement(0);
//        System.out.println(s);
//
//        List testList = new ArrayList();
//        testList.add("Zamulenie");
//        String ss = (String) testList.get(0);
//        Calc<Integer> calc = new Calc<>();
//        System.out.println(calc.add(4, 5));
//        Calc<BigDecimal> calc2 = new Calc<>();
//        System.out.println(calc2.add(new BigDecimal(3.4), new BigDecimal(8.7)));
//  Main main = new Main();
//  main.genericMethod(new Car("black","v50", "200", "150000", "Volvo"))
//  main.genericMethod(new Settings (Settings().setName("Verdana").);
    }

    public <T> T genericMethod(T t) {
        if (t instanceof Settings) {
            System.out.println("settings ");
            ((Settings) t).setName("Miriad");
        }
        if (t instanceof Car) {
            System.out.println("Car");
            ((Car) t).setName("Volvo");
        }
        return t;
    }
}