package task614;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x = getDoubleValue("X - var");
        int numberOfMembers = getIntValue("N - numbers");
        double epsilon = getDoubleValue("E - Epsilon");

        showResult(sumN(numberOfMembers, x), "Sum N numbers");
        showResult(sumNMoreE(numberOfMembers, x, epsilon), "Sum N More Epsilon");
        showResult(sumNMoreE(numberOfMembers, x, epsilon / 10), "Sum N More E share 10");
        showResult(mathOfFunction(numberOfMembers, x), "Math of Function");
    }

    public static double sumN(int numberOfMembers, double x) {
        double sumN = 0;
        double first = 1;
        int numberOfFactorial = 2;
        int degree = 2;

        if (numberOfMembers >= 1) {
            int numberOfElementsInTheSequence = 0;
            sumN += first;
            numberOfElementsInTheSequence++;
            while (numberOfElementsInTheSequence < numberOfMembers) {
                sumN = sumN + (Math.pow(x, degree) / getFactorial(numberOfFactorial));
                numberOfFactorial += 2;
                degree += 2;
                numberOfElementsInTheSequence++;
            }
        }
        return sumN;
    }

    public static double sumNMoreE(int numberOfMembers, double x, double epsilon) {
        double sumNMoreE = 0;
        double first = 1;
        int numberOfFactorial = 2;
        int degree = 2;
        double elementOfSequence;

        if (numberOfMembers >= 1) {
            int numberOfElementsInTheSequence = 0;
            numberOfElementsInTheSequence++;
            if (Math.abs(first) > Math.abs(epsilon)) {
                sumNMoreE += first;
            }

            while (numberOfElementsInTheSequence < numberOfMembers) {
                elementOfSequence = (Math.pow(x, degree) / getFactorial(numberOfFactorial));
                if (Math.abs(elementOfSequence) > Math.abs(epsilon)) {
                    sumNMoreE = sumNMoreE + elementOfSequence;
                }
                numberOfFactorial += 2;
                degree += 2;
                numberOfElementsInTheSequence++;
            }
        }
        return sumNMoreE;
    }

    public static double mathOfFunction(int numberOfMembers, double x) {
        double mathOfFunction = 0;
        double first = 1;
        int numberOfFactorial = 2;
        int degree = 2;

        if (numberOfMembers >= 1) {
            int numberOfElementsInTheSequence = 0;
            mathOfFunction += first;
            numberOfElementsInTheSequence++;

            while (numberOfElementsInTheSequence < numberOfMembers) {
                mathOfFunction = mathOfFunction + (Math.pow(x, degree) / getFactorial(numberOfFactorial));
                numberOfFactorial += 2;
                degree += 2;
                numberOfElementsInTheSequence++;
            }
        }
        return mathOfFunction;
    }

    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * getFactorial(f - 1);
        }
    }

    public static int getIntValue(String valueName) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input " + valueName + ":");

        return scanner.nextInt();
    }

    public static double getDoubleValue(String valueName) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input " + valueName + ":");

        return scanner.nextDouble();
    }

    public static void showResult(double result, String typeOfResult) {
        System.out.println("Result " + typeOfResult + ": " + result);
    }
}