package day5.queue;

public class ArrayQueue {
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
        if (firstIndex > lastIndex) {
            System.out.println("Kolejka pusta");
            return " ";
        }
        return stringArray[firstIndex++];
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue();
        System.out.println(arrayQueue.pop());
        arrayQueue.peek("Pierwszy element");
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        arrayQueue.peek("Drugi element");
        arrayQueue.peek("Trzeci element");
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        }
    }