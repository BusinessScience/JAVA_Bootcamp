import java.util.Stack;

public class Task_35 {
    public static void main(String[] args) {
        System.out.println(toBinaryString(23));
    }


    private static String toBinaryString(int n) {
        Stack<Integer> stack = new Stack<>();

        while (n != 0) {
            stack.add(n % 2);
            n /= 2;
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.empty())
            stringBuilder.append(stack.pop());

        return stringBuilder.toString();
    }
}
