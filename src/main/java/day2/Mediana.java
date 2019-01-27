package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Mediana {

    public List mediana1() {
        Scanner scanner = new Scanner(System.in);
        String s = " ";
        List<Double> list = new ArrayList<>();
        do {
            s = scanner.nextLine();
            try {
                double d = Double.parseDouble(s);
                list.add(d);
            } catch (NumberFormatException e) {
                if (!s.equals("q")) {
                    System.out.println("nie wpiano liczby, wpisz jeszcze raz lub q do exit");
                }
            }
        } while (!s.equals("q"));
        return list;

    }

    private double mediana(double... dable) {
        Arrays.sort(dable);
        int tbSize = dable.length;
        if (tbSize == 0) {
            throw new IllegalArgumentException("Metoda powinna posiadać min. 1 cyfrę");
        }
        if (tbSize % 2 == 0) {
            return (dable[tbSize / 2 - 1] + dable[tbSize / 2]) / 2;
        }
        return (dable[tbSize / 2]);
    }

    public static void main(String[] args) {
        Mediana mediana = new Mediana();
//        System.out.println("Mediana wynosi "+mediana.mediana(5, 3, 5, 5, 6, 2, 1, 9));
        //       System.out.println("Mediana wynosi "+mediana.mediana(3, 2, 1));
        System.out.println(mediana.mediana1());
    }
}
