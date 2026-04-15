import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberUtilsPathTest {

    @Test
    public void testPathCoverage() {
        NumberUtils utils = new NumberUtils();
        
        assertEquals(-1, utils.findFirstPositive(new int[]{}));
        assertEquals(-1, utils.findFirstPositive(new int[]{-1, -2}));
        assertEquals(10, utils.findFirstPositive(new int[]{10, -5}));
        assertEquals(7, utils.findFirstPositive(new int[]{-3, 7, -1}));
    }
}
