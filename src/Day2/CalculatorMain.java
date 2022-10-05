package Day2;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("5 + 7 = " + calculator.add(5, 7));
        System.out.println("10 - 3 = " + calculator.minus(10, 3));
        System.out.println("3 * 7 = " + calculator.multiple(3, 7));
        System.out.println("10 / 4 = " + calculator.divide(10, 4));
    }
}
