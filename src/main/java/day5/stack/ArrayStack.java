package day5.stack;

public class ArrayStack {
    String[] stringArray = new String[100];
    int lastIndex = -1;

    public void peek(String s) {
        if (lastIndex == stringArray.length - 1) {
            System.out.print("Stos jest pełny");
            return;
        }
        stringArray[++lastIndex] = s;
    }

    public String pop() {
        if (lastIndex < 0) {
            System.out.print("Stos jest pusty");
            return " ";
        }
        return stringArray[lastIndex--];
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack();
        System.out.println(arrayStack.pop() + " ");
        for (int i = 0; i < arrayStack.stringArray.length; i++) {
            arrayStack.peek("string" + i);
        }
        for (String s:arrayStack.stringArray)
            System.out.print(arrayStack.pop() + " ");
    }
}
