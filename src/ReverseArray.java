import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(intArray);
        reverseArray(intArray);
        printArray(intArray);

        String str = "Reverse Array Using Stack";
        System.out.println("Before: " + str);
        System.out.println("After reversed: " + reverseString(str));
    }

    private static StringBuilder reverseString(String str) {
        Stack<String> wStack = new Stack<>();
        String[] words = str.split(" ");

        for (String word : words) {
            wStack.push(word);
        }

        for (int i = 0; i < words.length; i++) {
            words[i] = wStack.pop();
        }

        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            reversedString.append(word).append(" ");
        }
        return reversedString;
    }

    private static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int number : array) {
            stack.push(number);

        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    private static void printArray(int[] intArray) {
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
