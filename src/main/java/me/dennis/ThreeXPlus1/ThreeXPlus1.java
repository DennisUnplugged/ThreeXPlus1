package me.dennis.ThreeXPlus1;

import me.dennis.ThreeXPlus1.utils.IOUtils;
import me.dennis.ThreeXPlus1.utils.MathUtils;
import org.slf4j.*;

public class ThreeXPlus1 {
    private final float seed;
    private final MathUtils math;
    public final static Logger LOGGER = LoggerFactory.getLogger(ThreeXPlus1.class);

    public ThreeXPlus1(float seed) {
        this.seed = seed;
        this.math = new MathUtils();

        start();
    }

    private void start() {
        LOGGER.info("Seed is " + seed);

        LOGGER.info("Validating seed...");
        math.validateSeed(seed);
        LOGGER.info("Validation complete!");

        LOGGER.info("Starting computation process...");
        float innerSeed = seed;

        try {
            //COMPUTATION ALGORITHM
            while (innerSeed != 1) {
                if (math.isEven(innerSeed)) {
                    LOGGER.info("Number " + innerSeed + " is even, devising by 2");

                    innerSeed = innerSeed/2;
                } else {
                    LOGGER.info("Number " + innerSeed + " is odd, multiplying by 3, adding 1");

                    innerSeed = (innerSeed*3) + 1;
                }
            }
            LOGGER.info("Computation finished, number " + seed + " ended up at 1.");
            IOUtils.pressAnyKeyToContinue(0);
        } catch (Exception x) {
            LOGGER.warn("Computation encountered a problem, seed didn't end up at 1!");
            IOUtils.pressAnyKeyToContinue(1);
        }

    }
}
