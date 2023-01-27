import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("park");
        names.add("lee");
        names.add("kim");
        names.add("choi");

        List<String> collect = names.stream().map((s) -> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());

        System.out.println("============");

        collect.forEach(System.out::println);

        System.out.println("============");

        names.forEach(System.out::println);
        System.out.println();

        List<String> collect1 = names.parallelStream().map(s -> {
            System.out.println(s + " " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());
        collect1.forEach(System.out::println);
    }

}
