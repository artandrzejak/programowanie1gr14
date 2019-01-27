package day3.threads;

public class CountLetter extends Thread {

    @Override
    public void run() {
        int end = 0;
        int i = 0;
        try {
            char a = 'A';
            while (end<40) {
                end++;
                i = (i + 1) % 10;
                System.out.print((char) (i + a));
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Przerwany wątek");
        }
    }
}