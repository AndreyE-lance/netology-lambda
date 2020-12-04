public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 5);
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);
        calc.println.accept(calc.abs.apply(0));
        calc.println.accept(calc.abs.apply(-5));
        calc.println.accept(calc.abs.apply(5));
        calc.println.accept(calc.abs.apply(Integer.MIN_VALUE));
        calc.println.accept(calc.abs.apply(Integer.MAX_VALUE));
    }
}
