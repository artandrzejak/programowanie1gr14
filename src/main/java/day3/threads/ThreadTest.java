package day3.threads;

public class ThreadTest {
    private static Object CountNumbers;

    static boolean dd = true;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start ");
//        new Thread(new CountNumbers()).start();
//        new CountLetter().start();
//    new Thread(()-> countLetters()).start();
//        Thread t = new Thread() {
//            @Override
//            public void run() {
//                countLetters();
//            }
//        };
//        t.start();
//        Thread t1 = new Thread(new CountNumbers());
//        Thread t2 = new CountLetter();
//        t1.start();
//        t2.start();
//        Thread.sleep(3000);
//        t1.interrupt();
//        t1.join();
//        t2.join();
        new Thread(() -> countLetters()).start();
        Thread.sleep(3000);
        dd = false;

        System.out.println(" End");
    }

    static void countLetters() {

        int i = 0;
        try {
            char a = 'A';
            while (dd) {
                i = (i + 1) % 10;
                System.out.print((char) (i + a));
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            System.out.println("Przerwany wątek");
        }
    }
}
