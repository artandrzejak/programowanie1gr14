package day6.reflection.inheritance;

public class Main {
    public static void main(String[] args) {
        /* Zoo animal = new Animal();
        animal.method("Gatunek");
        animal.writeSomething("Imię");
         */
        SomeAbstract someAbstract = new SomeAbstract() {
            @Override
            void abstractMethod() {
                System.out.println("override abstract method");
            }
        };
        someAbstract.abstractMethod();
        someAbstract.writeSth();
    }
}