package day1.lambda;

public class CalculatorImp {
    public static void main(String[] args) {
        System.out.println(new CalculatorImp().add(7, 4));
        System.out.println(new CalculatorImp().sub(7, 4));
        System.out.println(new CalculatorImp().mul(7, 4));
        System.out.println(new CalculatorImp().div(7, 4));

    }


//    private int add (int a, int b){
//
//        Calculator calc = new Calculator() {
//            @Override
//            public int calc(int a, int b) {
//                return a + b;
//            }
//        };
//        return calc.calc(a, b);
//    }

    private int add(int a, int b) {

        Calculator calc = (x, y) -> x + y;
        return calc.calc(a, b);
    }

    private int sub(int a, int b) {

        Calculator calc = (x, y) -> x - y;
        return calc.calc(a, b);
    }

    private int mul(int a, int b) {

        Calculator calc = (x, y) -> x * y;
        return calc.calc(a, b);
    }

    private int div(int a, int b) {

        Calculator calc = (x, y) -> x / y;
        return calc.calc(a, b);
    }
}

