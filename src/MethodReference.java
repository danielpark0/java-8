import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodReference {
    public static void main(String[] args) {
        UnaryOperator<String> hi = Greeting::hi;

        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        System.out.println(hello.apply("park"));

        Supplier<Greeting> newGreeting = Greeting::new;
        newGreeting.get();

        Function<String, Greeting> parkGreeting = Greeting::new;
        Greeting park = parkGreeting.apply("park");
        System.out.println(park.getName());

        String[] names = {"park", "lee", "kim"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
    }
}
