package thoughtworks.twu.talavera.introJava;


import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
        runTriangleExercises();

        runDiamondExercises();

        System.out.println("FizzBuzz");
        fizzBuzz();
        System.out.println();

        System.out.println("PrimeFactors");
        List<Integer> primeFactors = generate(30);
        for (Integer p : primeFactors) {
            System.out.println(p);
        }


    }

    private static List<Integer> generate(int n) {
        List<Integer> primeFactors = new ArrayList<>();

        int i = 2;
        while (n >= 2) {
            if (n % i == 0) {
                n = n / i;
                primeFactors.add(i);
            } else {
                i++;
            }
        }
        return primeFactors;
    }


    private static void fizzBuzz() {
        for (int i = 1; i < 100; i++) {


            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
                continue;
            }
            ;


            if (i % 3 == 0) {
                System.out.print("fizz");
            }
            ;
            if (i % 5 == 0) {
                System.out.print("buzz");
            }
            ;


            System.out.println();


        }
    }


    private static void runDiamondExercises() {

        System.out.println("Isosceles Triangule");
        Diamond.drawIsosTriangle(2);
        System.out.println();

        System.out.println("Diamond");
        Diamond.drawDiamond(3);
        System.out.println();

        System.out.println("Diamond with name");
        Diamond.drawDiamondWithName(3, "Felipe");
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

}
