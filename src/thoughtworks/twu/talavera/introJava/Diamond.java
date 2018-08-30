package thoughtworks.twu.talavera.introJava;

public class Diamond {
    static void drawDiamond(int n) {
        drawIsosTriangle(n);
        drawInvertedTriangle(n);
    }

    static void drawDiamondWithName(int n, String name) {
        drawIsosTriangle(n - 1);
        System.out.println(name);
        drawInvertedTriangle(n);
    }

    private static void drawInvertedTriangle(int n) {
        for (int i = n - 2; i >= 0; i--) {

            printSpaces(i);
            printLine(i);
            System.out.println();

        }
    }

    static void drawIsosTriangle(int n) {
        for (int i = 0; i <n; i++) {
            printSpaces(i);
            printLine(i);
            System.out.println();
        }
    }

    private static void printSpaces(int i) {
        for (int j = 0; j < 3 - i; j++) {
            printSpace();
        }
    }

    private static void printLine(int i) {
        for (int j = 0; j < 1 + i*2; j++) {
            printAsterisk();
        }
    }

    private static void printSpace() {
        System.out.print(" ");
    }

    private static void printAsterisk() {
        System.out.print("*");
    }
}
