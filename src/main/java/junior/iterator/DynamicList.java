package junior.iterator;


import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;

public class DynamicList<T> implements Iterable<T> {

    private Node<T> first;
    private Node<T> last;
    private int amount;

    public static void main(String[] args) {
           DynamicList<String> myTest = new DynamicList<String>();
           myTest.add("julia");
           myTest.add("slava");
           myTest.add("kamik");
           System.out.println((String) myTest.get(10));

       }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {

            private Node<T> point = first;
            int modCount = amount;

            void checkModCount() {
                if (modCount != amount) {
                    throw new ConcurrentModificationException("error");
                }
            }

            @Override
            public boolean hasNext() {
                checkModCount();
                return Objects.nonNull(point.getNext());
            }

            @Override
            public T next() {
                checkModCount();
                if (!hasNext()) {
                    throw new IndexOutOfBoundsException("error");
                }
                var temp = point.getValue();
                point = point.getNext();
                return temp;
            }
        };
    }

    public <T> T get(int position) {
        if (position > amount - 1) {
            throw new IndexOutOfBoundsException("error");
        }

        Node tempNode = first;
        if (position == 0) {
            return (T) tempNode.getValue();
        }
        for (int i = 1; i <= position; i++) {
            tempNode = tempNode.getNext();
        }
        return (T) tempNode.getValue();
    }

    public void add(T model) {
        amount++;
        var node = new Node<T>();
        node.setValue(model);
        Node temp;

        if (first == null) {
            first = node;
            last = node;
            return;
        }

        temp = last;
        last = node;
        node.setPrev(temp);
        temp.setNext(last);
    }
}
