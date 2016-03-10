/**
 * Created by Serg on 09.03.2016.
 */
import org.junit.Test;
import org.junit.Assert;
public class CircleTest {
    @Test
    public void CircleAreaTest() {
        Circle c=new Circle(10);
        Assert.assertEquals(314,Math.round(c.calcArea()));
    }
}

