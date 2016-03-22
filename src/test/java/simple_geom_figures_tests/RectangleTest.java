package simple_geom_figures_tests; /**
 * Created by Serg on 09.03.2016.
 */
import org.junit.Test;
import org.junit.Assert;
import simple_geom_figures.Rectangle;

public class RectangleTest {
    @Test
    public void RectangleAreaTest() {
        Rectangle r=new Rectangle(10, 50);
        Assert.assertEquals(500, Math.round(r.calcArea()));
    }

    @Test
    public  void RectanglePerimeterTest(){
        Rectangle rp=new Rectangle(10.25, 20.025);
        Assert.assertEquals(60.55, rp.calcPerimeter(), 0.0f);
    }
}
