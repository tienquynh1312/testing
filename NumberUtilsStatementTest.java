import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberUtilsStatementTest {

    @Test
    public void testStatementCoverage() {
        NumberUtils utils = new NumberUtils();
        
        assertEquals(5, utils.findFirstPositive(new int[]{5}));
       
        assertEquals(-1, utils.findFirstPositive(new int[]{-2}));
        
        assertEquals(-1, utils.findFirstPositive(new int[]{}));
    }
}
