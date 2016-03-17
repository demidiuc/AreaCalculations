/**
 * Created by Serg on 17.03.2016.
 */
import org.junit.Test;
import org.junit.Assert;
public class EllipseTest {
    @Test
    public void EllipseAreaTest() {
        Ellipse c= new Ellipse(10, 20);
        Assert.assertEquals(628,Math.round(c.calcArea()));
    }

    @Test
    public void EllipsePerimeterTest() {
        Ellipse cp= new Ellipse(20, 10);
        Assert.assertEquals(97, Math.round(cp.calcPerimeter()));
    }
}





