import Math.*;
public class MinMaxCalculation {
    public static double min(double ... numbers) {
        double min = 0;
        for (int i = 0; i < numbers.length; i++) {
            min = Math.min(min, numbers[i]);
        }
        return min;
    }

    public static double min(double ... numbers) {
        double max = 0;
        for (int i = 0; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
        }
        return max;
    }
}
