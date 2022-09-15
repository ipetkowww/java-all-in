package stackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {

    private List<String> data;
    private int index;

    public StackOfStrings() {
        data = new ArrayList<>();
        index = -1;
    }

    public void push(String element) {
        data.add(element);
        index++;
    }

    public String pop() {
        return data.remove(index--);
    }

    public String peek() {
        return data.get(index);
    }

    public boolean isEmpty() {
        return index == -1;
    }
}
