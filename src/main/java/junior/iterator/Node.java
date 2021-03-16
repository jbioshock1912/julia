package junior.iterator;

public class Node<E> {
    private E getValue;
    private Node prev;
    private Node next;
    private E value;

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
