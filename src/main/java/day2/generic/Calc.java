package day2.generic;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Calc<T extends Number> {

    public Number add(T a, T b) {
        if (a instanceof Integer) {
            int c = a.intValue();
            int d = b.intValue();
            System.out.println("Integer");
            return (Integer) (c + d);
        }
        if (a instanceof BigDecimal) {
            System.out.println("BigDeci mal");
           return (BigDecimal) ((BigDecimal) a).add((BigDecimal) b);
        }
        return null;

    }
}
