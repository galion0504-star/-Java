public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("pop: " + stack.pop());
        System.out.println("peek: " + stack.peek());
        System.out.println("size: " + stack.size());
    }
}
