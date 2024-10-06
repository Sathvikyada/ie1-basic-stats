public class MinMaxCalculation {
    public static double[] minMax(double ... numbers) {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (double num : numbers) {
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        return new double[]{min, max};
    }
}