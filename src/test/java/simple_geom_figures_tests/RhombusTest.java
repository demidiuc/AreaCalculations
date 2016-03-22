package simple_geom_figures_tests; /**
 * Created by Serg on 09.03.2016.
 */
import org.junit.Test;
import org.junit.Assert;
import simple_geom_figures.Rhombus;

public class RhombusTest {
    @Test
    public void RhombusAreaTest() {
        Rhombus c= new Rhombus(10, 20);
        Assert.assertEquals(100,Math.round(c.calcArea()));
    }

    @Test
    public void RhombusPerimeterTest() {
        Rhombus cp= new Rhombus(100);
        Assert.assertEquals(400, Math.round(cp.calcPerimeter()));
    }
}

