package ru.job4j.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class ForwardLinked<T> implements Iterable<T> {
    private Node<T> head;

    public void add(T value) {
        Node<T> node = new Node<T>(value, null);
        if (head == null) {
            head = node;
            return;
        }
        Node<T> tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = node;
    }

    public void deleteFirst() {
        if (head == null) {
            throw new NoSuchElementException("no element");
        }
        var temp = head.next;
        head = temp;
    }

    public T deleteLast() {
        if (head == null) {
            throw new NoSuchElementException("no element");
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        var lastValue = last.getValue();

        var prevLast = head;
        while (prevLast.next != last && prevLast.next != null) {
            prevLast = prevLast.next;
        }

        last = null;
        prevLast.next = null;
        return (T) lastValue;
    }

    public void revert() {
        Node currentNode = head;
        Node prevNode = null;
        Node nextNode = currentNode.next;
        Node tempNode = null;
        while (nextNode != null) {
            nextNode = nextNode.next;
            tempNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = tempNode;
        }

        head = tempNode;
        head.next = prevNode;

       /* Stack myStack = new Stack();
        Node node;
        Iterator myIterator = this.iterator();
        while (myIterator.hasNext()) {
            myStack.add(myIterator.next());
        }

        do {
            node = (Node) myStack.pop();

        } while (node != head);*/
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> node = head;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T value = node.value;
                node = node.next;
                return value;
            }
        };
    }

    static class Node<T> {
        T value;
        Node<T> next;

        public T getValue() {
            return value;
        }

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
}