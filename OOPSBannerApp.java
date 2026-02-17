/**
 * OOPSBannerApp
 *
 * Use Case 4:
 * Store banner lines in String array
 * and print using loop for better modularity.
 *
 * @author Mahadev
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

                String.join("  ",
                        " ***** ",
                        " ***** ",
                        " ***** ",
                        " ***** "),

                String.join("  ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     "),

                String.join("  ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     "),

                String.join("  ",
                        "*     *",
                        "*     *",
                        " ***** ",
                        " ***** "),

                String.join("  ",
                        "*     *",
                        "*     *",
                        "*      ",
                        "*     "),

                String.join("  ",
                        "*     *",
                        "*     *",
                        "*      ",
                        "*     "),

                String.join("  ",
                        " ***** ",
                        " ***** ",
                        "*      ",
                        " ***** ")
        };

        // Enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
