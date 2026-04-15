import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberUtilsPathTest {

    @Test
    public void testPathCoverage() {
        NumberUtils utils = new NumberUtils();
        
        // Path 1: Array is empty -> skip loop -> return -1
        assertEquals(-1, utils.findFirstPositive(new int[]{}));
        
        // Path 2: Array has only negatives -> loop all -> return -1
        assertEquals(-1, utils.findFirstPositive(new int[]{-1, -2}));
        
        // Path 3: First element is positive -> loop 1 time -> return positive
        assertEquals(10, utils.findFirstPositive(new int[]{10, -5}));
        
        // Path 4: Second element is positive -> loop 2 times -> return positive
        assertEquals(7, utils.findFirstPositive(new int[]{-3, 7, -1}));
    }
}
