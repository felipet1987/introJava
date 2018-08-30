package thoughtworks.twu.talavera.introJava;



class Main {

    public static void main(String[] args) {
        //runTriangleExercises();



        drawIsosTriangle(4);


    }

    private static void drawIsosTriangle(int n) {

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

    private static void runTriangleExercises() {
        System.out.println("Easiest exercise ever");
        Triangle.printAsterisk();
        System.out.println();

        System.out.println("Draw a horizontal line");
        Triangle.printAsteriskLine(8);
        System.out.println();

        System.out.println("Draw a vertical line");
        Triangle.printVerticalAsteriskLine(3);
        System.out.println();

        System.out.println("Draw a right triangle");
        Triangle.DrawRightTriangle(3);
    }

    private static void printAsterisk() {
        System.out.print("*");
    }
}
