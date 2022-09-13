package randomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<E> extends ArrayList<E> {

    public E getRandomElement() {
        int end = size();
        Random r = new Random();
        return remove(r.nextInt(end));
    }
}
