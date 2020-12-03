public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
       /* int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);*/
        int a = calc.abs.apply(0);
        calc.println.accept(a);
        int b = calc.abs.apply(-2);
        calc.println.accept(b);
        int c = calc.abs.apply(5);
        calc.println.accept(c);
    }
}
