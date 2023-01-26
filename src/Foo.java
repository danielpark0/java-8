import java.util.function.*;

public class Foo {
    public static void main(String[] args) {
        // 익명 내부 클래스 (anonymous innerclass)
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello");
            }
        };

        RunSomething runSomething1 = () -> System.out.println("Hello1");
        runSomething1.doIt();

        RunSomething runSomething2 = () -> {
            System.out.println("Hello2");
            System.out.println("Hello3");
        };
        runSomething2.doIt();

        Plus10 plus10 = new Plus10();
        System.out.println("plus10.apply(1) = " + plus10.apply(1));

        Function<Integer, Integer> plus11 = (i) -> i + 11;
        System.out.println("plus11.apply(1) = " + plus11.apply(1));

        Function<Integer, Integer> multiply2 = (i) -> i * 2;
        Function<Integer, Integer> multiply2AndPlus11 = plus11.compose(multiply2);
        System.out.println("multiply2AndPlus11.apply(2) = " + multiply2AndPlus11.apply(2));
        System.out.println(plus11.andThen(multiply2).apply(2));

        Consumer<Integer> printT = (i) -> System.out.println("i = " + i);
        printT.accept(10);

        Supplier<Integer> get10 = () -> 10;
        System.out.println("get10.get() = " + get10.get());

        Predicate<String> startsWithPark = (s) -> s.startsWith("park");
        Predicate<Integer> isEven = (i) -> i%2 == 0;

        UnaryOperator<Integer> plus12 = (i) -> i + 12;

        BinaryOperator<Integer> sum = (a, b) -> a + b;
    }
}
