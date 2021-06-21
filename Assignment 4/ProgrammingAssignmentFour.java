/**
 * @author David Hartley
 *         CS& 143 Programming Assignment 4,
 *         Testing class that has the Ananymous Inner Class and Lambda Functions
 *         Each are in their own method corresponding with the number on the write up
 */
public class ProgrammingAssignmentFour {
    public static void main(String[] args) {
        //Constant variable for all the tests for each question
        final int NUM = 4;
        //Print out all tests
        System.out.println("Question 1 Tests:");
        questionOne(NUM);
        System.out.println("-----------------");
        System.out.println("Question 2 Tests:");
        questionTwo(NUM, NUM);
        System.out.println("-----------------");
        System.out.println("Question 3 Tests:");
        questionThree(NUM);
        System.out.println("-----------------");
        System.out.println("Question 4 Tests:");
        questionFour(NUM);
    }

    /**
     * Method that tests question Ones Inner Class and Lambda expression code
     *
     * @param x Numeric variable to test the code
     */
    public static void questionOne(int x) {
        // 1.) Anonymous Inner Class:
        IntCalculator questionOneInnerClass = new IntCalculator() {
            /** Overrides IntCalculator method and gives it a polynomial calculation
             * @param x The value to input into the polynomial
             * @return The The "Y" value of the polynomial Expression in y = x^2 + 2x + 4
             */
            @Override
            public int calculate(int x) {
                return x * x + 2 * x + 4;
            }
        };
        // 1.) Lambda Expression: Calculates the polynomial expression y = x^2 + 2x + 4
        IntCalculator questionOneLambda = num -> num * num + 2 * num + 4;

        //Print out Questions Tests
        System.out.println("Inner Class: " + questionOneInnerClass.calculate(x));
        System.out.println("Lambda: " + questionOneLambda.calculate(x));
    }

    /**
     * Method that tests question Twos Inner Class and Lambda expression code
     *
     * @param x Numeric variable to test the code
     * @param y Numeric variable to test the code
     */
    public static void questionTwo(int x, int y) {
        // 2.) Anonymous Inner Class:
        TwoDoubleCalculator questionTwoInnerClass = new TwoDoubleCalculator() {
            /** Method overrides Calculate method in the TwoDoubleCalculator Interface
             *  Gives functionality to that of a x^y calculation
             * @param x The base of the exponential calculation
             * @param y The exponent value
             * @return The value of x^y
             */
            @Override
            public double calculate(double x, double y) {
                return Math.pow(x, y);
            }
        };
        // 2.) Lambda Expression:
        TwoDoubleCalculator questionTwoLambda = (base, exponent) -> Math.pow(base, exponent);

        //Print out tests
        System.out.println("Inner Class: " + questionTwoInnerClass.calculate(x, y));
        System.out.println("Lambda: " + questionTwoLambda.calculate(x, y));
    }

    /**
     * Method that tests question Threes Inner Class and Lambda expression code
     *
     * @param r Numeric variable to test the code
     */
    public static void questionThree(int r) {
        // 3.) Anonymous Inner Class:
        DoubleCalculator questionThreeInnerClass = new DoubleCalculator() {
            /** Overrides the calculate method in DoubleCalculator Interface
             *
             * @param number THe number variable to calculate
             * @return The area of a circle with the provided "radius" parameter
             */
            @Override
            public double calculate(double number) {
                return Math.PI * number * number;
            }
        };
        // 3.) Lambda:
        DoubleCalculator questionThreeLambda = radius -> Math.PI * radius * radius;

        //Print out Question Tests
        System.out.println("Inner Class: " + questionThreeInnerClass.calculate(r));
        System.out.println("Lambda: " + questionThreeLambda.calculate(r));
    }


    /**
     * Method that tests question Fours Inner Class and Lambda expression code
     *
     * @param x Numeric variable to test the code
     */
    public static void questionFour(int x) {
        // 4.) Anonymous Inner Class:
        IntCalculator questionFourInnerClass = new IntCalculator() {
            /** Overrides the calculate method in IntCalculator to give it the functionality of calculating
             *  the factorial of the number
             * @param number The number to find the factorial of
             * @return 1 if the number is 0 or negative, or the factorial of any other number
             */
            @Override
            public int calculate(int number) {
                return number <= 0 ? 1 : factorial(number);
            }

            /** Recursive method that gets the factorial of the provided number
             *
             * @param num The current number that the calculation is on
             * @return The current parameter * the parameter - 1
             */
            private int factorial(int num) {
                if (num == 1) return 1;
                return num * factorial(num - 1);
            }
        };
        // 4.) Lambda:
        IntCalculator questionFourLambda = (int num) -> {
            if (num <= 0) return 1;//if the number is 0 or negative return 1
            //Running constant for the factorial. Variable starts at 1 as you cannot multiply by 0
            int factorial = 1;
            //For each number after 1. This is allowed as if the num is 1, 1 is still returned after the loop.
            //Integer value of 2 is still accounted for in the for-loop
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }
            return factorial;//return the factorial
        };

        //Print out tests
        System.out.println("Inner Class: " + questionFourInnerClass.calculate(x));
        System.out.println("Lambda: " + questionFourLambda.calculate(x));
    }

}
