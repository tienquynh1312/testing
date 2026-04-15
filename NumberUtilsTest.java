import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {
    @Test
    public void testFindFirstPositive() {
        NumberUtils utils = new NumberUtils();
        
        // Test case 1: Có số dương
        assertEquals(5, utils.findFirstPositive(new int[]{-1, -2, 5, 3}));
        
        // Test case 2: Không có số dương
        assertEquals(-1, utils.findFirstPositive(new int[]{-1, -2, -3}));
        
        // Test case 3: Mảng rỗng
        assertEquals(-1, utils.findFirstPositive(new int[]{}));
    }
}
