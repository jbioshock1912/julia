package junior.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MatrixIt implements Iterator<Integer> {
    private final int[][] data;
    private int row = -1;
    private int column = -1;

    public MatrixIt(int[][] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        if (row == -1 && column == -1) {
            return data.length != 0 && data[0].length != 0;
        }
        int x = row, y = column;
        y++;
        if (y > data[x].length - 1) {
            y = 0;
            x++;
        }
        return data.length < x;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        if (row == -1 && column == -1) {
            row = 0;
            column = 0;
        } else {
            column++;
            if (column > data[row].length - 1) {
                column = 0;
                row++;
            }
        }
        return data[row][column];
    }
}