package lesson9.calc;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.plus(10,20));
        System.out.println(calculator.minus(35,3));
        System.out.println(calculator.divide(32,3));
        System.out.println(calculator.multiple(54,2));
    }
}
