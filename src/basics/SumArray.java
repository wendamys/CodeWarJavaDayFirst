public class SumArray {

// test input -> [1.1, 2.2, 3.3]
// output -> 6.6

    public static double sum(double[] numbers) {
        double sum = 0.0;
        if (numbers.length > 0) {
            for (int i = 0; numbers.length > i; i++) {
                sum += numbers[i];
            }
        }
        return sum;
    }
}