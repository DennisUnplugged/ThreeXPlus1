import me.dennis.ThreeXPlus1.ThreeXPlus1;
import me.dennis.ThreeXPlus1.utils.IOUtils;

import java.util.Scanner;


public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter seed: ");

        try {
            float seed = scanner.nextFloat();
            new ThreeXPlus1(seed);
        } catch (Exception e) {
            ThreeXPlus1.LOGGER.error("Seed is invalid!");
            IOUtils.pressAnyKeyToContinue(1);
        }

    }
}
