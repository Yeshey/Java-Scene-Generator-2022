package utils;

import java.util.Random;

public class RandInt {
    public static int between(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
