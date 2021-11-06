package lesson10;

import lesson9.calc.Calculator;

import java.util.Scanner;

public class ScannerExample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plase input a");
        int a = scanner.nextInt();
        System.out.println("plase input b");
        int b = scanner.nextInt();

        System.out.println("plase input operation (+,-,/,*)");
        String operation = scanner.next();
        Calculator calc = new Calculator();
        switch (operation){
            case "+":
                System.out.println(calc.plus(a,b));
                break;
            case "-":
                System.out.println(calc.minus(a,b));
                break;
            case "/":
                System.out.println(calc.divide(a,b));
                break;
            case "*":
                System.out.println(calc.multiple(a,b));
                break;

        }
    }
}
