public class NumberUtils {
    public int findFirstPositive(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) { // Vòng lặp
            if (numbers[i] > 0) {                  // Lệnh rẽ nhánh
                return numbers[i];
            }
        }
        return -1;
    }
}
