public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push("hey");
        stack.remove(0);
        stack.push("hey");
        stack.size();
        stack.peek();
        stack.clear();
        stack.push("hey");
        stack.pop();
    }
}