package day6.reflection.inheritance;

public abstract class SomeAbstract {
    private int a = 1;
    public void writeSth(){
        System.out.println("Write sth " + a);
    }
    abstract void abstractMethod();
}
