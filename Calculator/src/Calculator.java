import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    IntBinaryOperator division = (x, y) -> x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

    void apply(IntBinaryOperator op, int x, int y) {
        try {
            int result = op.applyAsInt(x, y);
            System.out.println("Result is " + result);
        }
        catch(ArithmeticException e) {
            System.err.println("Division by zero!");
        }
    }
}





