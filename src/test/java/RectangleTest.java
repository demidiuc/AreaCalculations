/**
 * Created by Serg on 09.03.2016.
 */
import org.junit.Test;
import org.junit.Assert;
public class RectangleTest {
    @Test
    public void RectangleAreaTest() {
        Rectangle r=new Rectangle(10, 50);
        Assert.assertEquals(500, Math.round(r.calcArea()));
    }
}
