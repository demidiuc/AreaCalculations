package simple_geom_figures_tests; /**
 * Created by Serg on 09.03.2016.
 */
import org.junit.Test;
import org.junit.Assert;
import simple_geom_figures.Circle;

public class CircleTest {
    @Test
    public void CircleAreaTest() {
        Circle c=new Circle(10);
        Assert.assertEquals(314,Math.round(c.calcArea()));
    }

    @Test
    public void CirclePerimeterTest() {
        Circle cp=new Circle(100);
        Assert.assertEquals(628, Math.round(cp.calcPerimeter()));
    }
}

