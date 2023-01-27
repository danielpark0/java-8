import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class DefaultMethods {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("park");
        names.add("lee");
        names.add("kim");
        names.add("choi");

        names.forEach(System.out::println);
        System.out.println();

        Spliterator<String> spliterator = names.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        while(spliterator.tryAdvance(System.out::println));
        System.out.println("===========");
        while(spliterator1.tryAdvance(System.out::println));
        System.out.println();

        names.removeIf(s -> s.startsWith("k"));

        names.forEach(System.out::println);
        System.out.println();

        names.sort(String::compareToIgnoreCase);

        names.forEach(System.out::println);
        System.out.println();

        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        names.sort(compareToIgnoreCase.reversed());

        names.forEach(System.out::println);
        System.out.println();

    }
}
