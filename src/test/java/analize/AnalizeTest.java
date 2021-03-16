package analize;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AnalizeTest {

    @Test
    public void diff() {
        List<Analize.User> previous = new ArrayList<>();
        List<Analize.User> current = new ArrayList<>();
        previous.add(new Analize.User(1, "julia"));
        previous.add(new Analize.User(2, "slava"));
        previous.add(new Analize.User(3, "kamik"));

        current.add(new Analize.User(1, "julia"));
        current.add(new Analize.User(2, "julia"));
        current.add(new Analize.User(8, "jd"));
        current.add(new Analize.User(9, "ssa"));

        Analize analize = new Analize();
        Analize.Info testStatistic = analize.diff(previous, current);

        Assert.assertEquals(testStatistic.added, 2);
        Assert.assertEquals(testStatistic.changed, 1);
        Assert.assertEquals(testStatistic.deleted, 1);
    }
}