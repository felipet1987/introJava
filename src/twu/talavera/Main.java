package twu.talavera;

class Main {

    public static void main(String[] args) {
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
}
