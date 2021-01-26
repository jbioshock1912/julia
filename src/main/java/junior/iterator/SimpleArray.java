package junior.iterator;

import java.lang.reflect.Array;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleArray<T> implements Iterable<T> {

    private int index = 0;
    private T[] objects;
    private static final int DEFAULT_SIZE = 10;
    private int expectedModCount = 0;

    public SimpleArray(int size) {
        this.objects = (T[]) new Object[size];
    }

    public SimpleArray() {
        this.objects = (T[]) new Object[DEFAULT_SIZE];
    }

    public void add(T model) {
        this.objects[index++] = model;
        expectedModCount++;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public <T> T remove(int index) {
        var temp = objects[index];
        objects[index] = null;
        expectedModCount++;
        return (T) temp;
    }

    public <T> T get(int position) {
        if (objects[position] == null) {
            throw new IndexOutOfBoundsException("error index");
        }
        return (T) this.objects[position];
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {

            private int point = 0;
            int iteratorModCount = expectedModCount;

            public void checkModCount() {
                if (iteratorModCount != expectedModCount) {
                    throw new ConcurrentModificationException("error");
                }
            }

            @Override
            public boolean hasNext()  {
                checkModCount();
                return point < objects.length && objects[point] != null;
            }

            @Override
            public T next() {
                checkModCount();
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return objects[point++];
            }
        };

    }
}
