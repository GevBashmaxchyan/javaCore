package lesson10;

import lesson9.calc.Calculator;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        while (true) {
            System.out.println("please input operation (+,-,/,*), or 0 for exit ");
            String operation = scanner.next();
            if (operation.equals("0")) {
                break;
            }
            if (!operation.equals("+") && !operation.equals("-") &&
                    !operation.equals("/") && !operation.equals("*")) {
                System.out.println("invalid operation");
            } else {
                System.out.println("please input a ");
                int a = scanner.nextInt();
                System.out.println("please input b ");
                int b = scanner.nextInt();
                switch (operation) {
                    case "+":
                        System.out.println(calc.plus(a, b));
                        break;
                    case "-":
                        System.out.println(calc.minus(a, b));
                        break;
                    case "/":
                        System.out.println(calc.divide(a, b));
                        break;
                    case "*":
                        System.out.println(calc.multiple(a, b));
                        break;
                }
            }


        }
    }
}
