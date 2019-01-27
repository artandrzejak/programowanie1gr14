package day5.queue;

public class ArrayQueue1 {
    String[] stringArray = new String[100];
    int firstIndex = 0;
    int lastIndex = -1;

    public void peek(String s) {
        if (lastIndex == stringArray.length - 1) {
            System.out.println("Kolejka pełna");
            return;
        }
        stringArray[++lastIndex] = s;
    }

    public String pop() {
        if (lastIndex < 0) {
            System.out.println("Kolejka pusta");
            return " ";
        }
        String s = stringArray[0];
        for (int i = 0; i < lastIndex; i++) {
            stringArray[i] = stringArray[i + 1];
        }
        lastIndex--;
        return s;
    }

    public static void main(String[] args) {
        ArrayQueue1 arrayQueue = new ArrayQueue1();
        System.out.println(arrayQueue.pop());
        arrayQueue.peek("Pierwszy element");
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        arrayQueue.peek("Drugi element");
        arrayQueue.peek("Trzeci element");
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        for (int i = 0; i < 10; i++) {
            arrayQueue.peek("Pierwszy element"+i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayQueue.pop());
        }
    }
}