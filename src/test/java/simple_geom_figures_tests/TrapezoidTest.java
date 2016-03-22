package simple_geom_figures_tests; /**
 * Created by Serg on 08.03.2016.
 */
import org.junit.Assert;
import org.junit.Test;
import simple_geom_figures.Trapezoid;

public class TrapezoidTest {

    @Test
    public void TrapezoidAreaTest() {
        Trapezoid t = new Trapezoid(5, 4, 8);
        Assert.assertEquals(36, Math.round(t.calcArea()));
    }

    @Test
    public void  TrapezoidPerimeterTest(){
        Trapezoid tp = new Trapezoid(10, 20, 20,5);
        Assert.assertEquals(55, tp.calcPerimeter(),0.0f);
    }
}

