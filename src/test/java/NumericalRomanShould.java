import model.NumericalRoman;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumericalRomanShould {
    private NumericalRoman nr;

    @Before
    public void setUp() throws Exception {
        nr = new NumericalRoman();
    }

    @Test
    public void convert_1_to_I() {
        String result = nr.change(1);
        Assert.assertEquals("I", result);
    }

    @Test
    public void convert_2_to_II() {
        String result = nr.change(2);
        Assert.assertEquals("II", result);
    }

    @Test
    public void convert_3_to_III() {
        Assert.assertEquals("III", nr.change(3));
    }
}
