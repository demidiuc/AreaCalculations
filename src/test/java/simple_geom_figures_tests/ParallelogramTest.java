package simple_geom_figures_tests; /**
 * Created by Serg on 15.03.2016.
 */
import org.junit.Test;
import org.junit.Assert;
import simple_geom_figures.Parallelogram;

public class ParallelogramTest {
    @Test
    public void ParallelogramAreaTest() {
        Parallelogram prlA=new Parallelogram(10, 20, 10);
        Assert.assertEquals(100, prlA.calcArea(), 0.0f);
    }

    @Test
    public void ParallelogramPerimeterTest() {
        Parallelogram prlP=new Parallelogram(1,20, 20);
        Assert.assertEquals(42, prlP.calcPerimeter(), 0.0f);
    }

}
