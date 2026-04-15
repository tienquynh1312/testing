import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberUtilsStatementTest {

    @Test
    public void testStatementCoverage() {
        NumberUtils utils = new NumberUtils();
        
        // Ca kiểm thử 1: Có số dương. 
        // Bao phủ: Khởi tạo for, điều kiện for, điều kiện if (True), lệnh return trong if.
        assertEquals(5, utils.findFirstPositive(new int[]{5}));
        
        // Ca kiểm thử 2: Không có số dương. 
        // Bao phủ: Khởi tạo for, điều kiện for, điều kiện if (False), chạy hết for, lệnh return -1 ở cuối.
        assertEquals(-1, utils.findFirstPositive(new int[]{-2}));
        
        // Ca kiểm thử 3: Mảng rỗng
        assertEquals(-1, utils.findFirstPositive(new int[]{}));
    }
}