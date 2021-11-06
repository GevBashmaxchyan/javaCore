package lesson9.calc;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.plus(3,6));
        System.out.println(calculator.minus(10,5));
        System.out.println(calculator.divide(4,2));
        System.out.println(calculator.multiple(2,4));
    }
}
