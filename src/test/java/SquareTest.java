/**
 * Created by Serg on 09.03.2016.
 */
import org.junit.Test;
import org.junit.Assert;
public class SquareTest {
    @Test
    public void SquareAreaTest() {
        Square s=new Square(10);
        Assert.assertEquals(100, Math.round(s.calcArea()));
    }

    @Test
    public void SquarePerimeterTest() {
        Square sp = new Square(5.3);
        Assert.assertEquals(21.2, sp.calcPerimeter(), 0.0f);
    }
}
