package ru.job4j.collection;

import junior.iterator.SimpleArray;

import java.util.Iterator;

public class SimpleSet<T> implements Iterable<T> {

    private SimpleArray<T> array = new SimpleArray<>();

    public void add(T value) {
        if (checkDouble(value)) {
            System.out.println("is dublikate");
            return;
        }
        array.add(value);
    }

    public boolean checkDouble(T value) {
        boolean hasDublikat = false;
        Iterator<T> arrayIterator = array.iterator();
        while (arrayIterator.hasNext()) {
            if (value.equals(arrayIterator.next())) {
                hasDublikat = true;
                break;
            }
        }
        return hasDublikat;
    }

    @Override
    public Iterator<T> iterator() {
        return array.iterator();
    }
}
