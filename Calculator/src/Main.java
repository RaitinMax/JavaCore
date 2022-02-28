import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(2, 1);
        int c = calc.divide.apply(4, 0);
//        int q = calc.division.applyAsInt(6,0);
        //надо "поймать" ArithmeticException, чтобы код работал
        int d = calc.abs.apply(-5);
        calc.println.accept(c);
        calc.println.accept(d);

    }
}
