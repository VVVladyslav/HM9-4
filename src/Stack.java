import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<Object> {

    private List<Object> stack = new ArrayList<>();

    public void push(Object value) {
        stack.add(value);
    }

    public void remove(int index) {
        if (index < 0 || index >= stack.size()) {
            throw new IndexOutOfBoundsException("Недійсний індекс");
        }
        stack.remove(index);
    }

    public void clear() {
        stack.clear();
    }

    public int size() {
        return stack.size();
    }

    public Object peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    public Object pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        int lastIndex = stack.size() - 1;
        Object topElement = stack.get(lastIndex);
        stack.remove(lastIndex);
        return topElement;
    }
}
