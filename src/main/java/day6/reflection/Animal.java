package day6.reflection;

public class Animal {

    @RunIt(name = "Dog")
    public void method1() {
        System.out.println("Wywołanie metody 1");
    }

    @RunIt(name = "Dog")
    public void method2() {
        System.out.println("Wywołanie metody 2");
    }

    public void method3() {
        System.out.println("Wywołanie metody 3");
    }

    public void method4() {
        System.out.println("Wywołanie metody 4");
    }

    public void method5() {
        System.out.println("Wywołanie metody 5");
    }

}
