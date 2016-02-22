package epam.com;

/**
 * Created by m18 on 22.02.2016.
 */
public class InitTest {

    private int id;
    private static int nextId;

    static {
        nextId = (int)(100*Math.random());
    }

    {
        nextId ++;
        id = nextId;
    }

    public int getId() {
        return id;

    }
}
