package junior.iterator;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

import static org.junit.Assert.*;

public class DynamicListTest {

    private DynamicList<Integer> dynamicList;

    @Before
    public void createDynamicListInteger() {
        dynamicList = new DynamicList<>();
        dynamicList.add(10);
        dynamicList.add(12);
        dynamicList.add(13);
    }

    @Test
    public void testIteratorHasNext() {
        Iterator<Integer> iterator = dynamicList.iterator();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorNext() {
        Iterator<Integer> iterator = dynamicList.iterator();
        assertThat(iterator.next(), Is.is(10));
        assertThat(iterator.next(), Is.is(12));
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testIteratorNextModException() {
        Iterator<Integer> iterator = dynamicList.iterator();
        iterator.next();
        dynamicList.add(14);
        iterator.next();
    }

    @Test
    public void testAdd() {
        assertThat(dynamicList.get(1), Is.is(12));
    }
}