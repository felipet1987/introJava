package thoughtworks.twu.talavera.introJava;

class Triangle {
    static void printVerticalAsteriskLine(int n) {
        for (int i = 0; i < n; i++) {
            printAsterisk();
            System.out.println();
        }
    }

    static void DrawRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            printAsteriskLine(i + 1);
            System.out.println();
        }
    }

    static void printAsteriskLine(int n) {
        for (int i = 0; i < n; i++) {
            printAsterisk();
        }
    }

    static void printAsterisk() {
        System.out.print("*");
    }
}
