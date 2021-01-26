package junior.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenIterator implements Iterator<Integer> {
    private final int[] data;
    private int point = 0;

    @Override
    public void remove() {

    }

    public EvenIterator(int[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {

        return (point <= data.length - 1) && isHasNextOddValue();
    }

    @Override
    public Integer next() throws NoSuchElementException {
        int result = 0;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        for (int i = point; i <= data.length - 1; i++) {
            if ((data[i] % 2 == 0)) {
                point = i + 1;
                result = data[i];
                break;
            }
        }
        return result;
    }



    private boolean isHasNextOddValue() {
        boolean result = false;
        for (int i = point; i < data.length; i++) {
            if ((data[i] % 2 == 0)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
