package tree;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

class Tree<E> implements SimpleTree<E> {
    private final Node<E> root;

    Tree(final E root) {
        this.root = new Node<>(root);
    }

    @Override
    public boolean add(E parent, E child) {
        boolean result = false;
        boolean nodeIsFound = false;
        Optional<Node<E>> resultNode = findBy(parent);
        if (resultNode.isPresent()) {
            Node<E> parentNode = resultNode.get();
            for (Node<E> childNode : parentNode.children) {
                if (childNode.value.equals(child)) {
                    nodeIsFound = true;
                    break;
                }
            }
            if (!nodeIsFound) {
                Node<E> childNode = new Node<>(child);
                parentNode.children.add(childNode);
                result = true;
            }
        }
        return result;
    }

    public boolean isBinary() {
        return isNodeBinary(root);
    }

    private boolean isNodeBinary(Node<E> node) {
        boolean isBinary = node.children.size() <= 2;
        if (isBinary) {
            for (Node<E> child : node.children) {
                isBinary = isNodeBinary(child);
                if (!isBinary) {
                    break;
                }
            }
        }
        return isBinary;
    }

    @Override
    public Optional<Node<E>> findBy(E value) {
        Optional<Node<E>> rsl = Optional.empty();
        Queue<Node<E>> data = new LinkedList<>();
        data.offer(this.root);
        while (!data.isEmpty()) {
            Node<E> el = data.poll();
            if (el.value.equals(value)) {
                rsl = Optional.of(el);
                break;
            }
            data.addAll(el.children);
        }
        return rsl;
    }
}
