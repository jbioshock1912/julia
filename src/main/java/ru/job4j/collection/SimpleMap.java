package ru.job4j.collection;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleMap<K, V> implements Iterable<V> {

    Node<V>[] arrayNods = new Node[100];
    private int expectedModCount = 0;


    public boolean insert(K key, V value) {
        boolean result = false;
        int hashKey = key.hashCode() % 100;
        if (arrayNods[hashKey] == null) {
            Node node = new Node(value);
            arrayNods[hashKey] = node;
            result = true;
        } else {
            Node tempNode = arrayNods[hashKey];
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            if (!tempNode.getValue().equals(value)) {
                tempNode.next = new Node(value);
                result = true;
            }
        }
        return result;
    }

    public V get(K key) {
        Node node = arrayNods[key.hashCode() % 100];
        return (V) node.getValue();
    }

    public boolean delete(K key) {
        boolean result = false;
        if (arrayNods[key.hashCode() % 100] != null) {
            arrayNods[key.hashCode() % 100] = null;
            result = true;
        }
        return result;
    }

    @Override
    public Iterator<V> iterator() {

        return new Iterator<V>() {

            private int point = findIndexNotNull(0);

            int iteratorModCount = expectedModCount;

            private int findIndexNotNull(int index) {
                int resultIndex = -1;
                for (int i = index; i < arrayNods.length; i++) {
                    if (arrayNods[i] != null) {
                        resultIndex = i;
                        break;
                    }
                }
                return resultIndex;
            }

            public void checkModCount() {
                if (iteratorModCount != expectedModCount) {
                    throw new ConcurrentModificationException("error");
                }
            }

            @Override
            public boolean hasNext() {
                checkModCount();
                return point < arrayNods.length && point != -1;
            }

            @Override
            public V next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                var value = arrayNods[point].getValue();
                point = findIndexNotNull(++point);
                return value;
            }
        };
    }

    private static class Node<T> {
        T value;
        Node<T> next;

        public T getValue() {
            return value;
        }

        public Node(T value) {
            this.value = value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
