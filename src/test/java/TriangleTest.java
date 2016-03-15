/**
 * Created by Serg on 08.03.2016.
 */
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void TriangleAreaTest() {
        Triangle t = new Triangle(10, 10);
        Assert.assertEquals(50, Math.round(t.calcArea()));
    }

    @Test
    public void  TrianglePerimeterTest(){
        Triangle tp = new Triangle(10, 10, 10);
        Assert.assertEquals(30, tp.calcPerimeter(),0.0f);
    }
}

