package me.dennis.ThreeXPlus1.utils;

import me.dennis.ThreeXPlus1.ThreeXPlus1;

public class MathUtils {

    public boolean isEven(float number) {
        return (number % 2) == 0;
    }

    public void validateSeed(float seed) {
        if (seed <= 1) {
            ThreeXPlus1.LOGGER.error("Seed cannot be less or equal to 1!");
            IOUtils.pressAnyKeyToContinue(1);
        }

    }
}
