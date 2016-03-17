/**
 * Created by Serg on 17.03.2016.
 */
import org.junit.Test;
import org.junit.Assert;

public class TrapezoidAltTest {
    @Test
    public void TrapezoidAltAreaTest() {
        TrapezoidAlt tra = new TrapezoidAlt(4, 10, 5, 5, 4);
        Assert.assertEquals(28, tra.calcAreaAlt(), 0.0f);
    }
}