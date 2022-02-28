public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(2, 1);
        calc.apply(calc.division, 1_337, 4);
        calc.apply(calc.division, 1_337, 0);
        calc.println.accept(b);
        calc.println.accept(a);
    }
}
