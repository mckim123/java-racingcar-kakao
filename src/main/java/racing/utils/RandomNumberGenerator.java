package racing.utils;

public class RandomNumberGenerator {
    private static final int LOWER_BOUND = 0;
    private static final int UPPER_BOUND = 9;

    public double generate() {
        return Math.random() * (UPPER_BOUND - LOWER_BOUND);
    }
}
