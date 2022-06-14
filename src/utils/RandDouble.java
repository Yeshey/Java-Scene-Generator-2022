package utils;

import java.util.Random;

public class RandDouble {
    public static double between(double min, double max) {
        Random r = new Random();
        return min + (max - min) * r.nextDouble();
    }
    public static double between(double min, double max, long seed) {
        Random r = new Random();
        r.setSeed(seed);
        return min + (max - min) * r.nextDouble();
    }
}
