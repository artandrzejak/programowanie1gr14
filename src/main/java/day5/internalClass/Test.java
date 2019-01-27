package day5.internalClass;

public class Test {
    public static class InternalStatic {
        public static int a = 7;
        private static int b = 12;
        public int c = 17;
        private int d = 18;
    }
    public void method1(){
        InternalStatic test = new InternalStatic();
        InternalStatic.a = 15;
        InternalStatic.b = 7;
        test.c = 1;
        test.d = 3;
    }
}