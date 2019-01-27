package day6.reflection.inheritance;

public interface Zoo {
void writeSomething(String a);
default void method(String a){
    System.out.println("coś tam " + a);
}

}
