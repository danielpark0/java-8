import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "springboot", true));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        Optional<OnlineClass> spring = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        spring.ifPresent(oc -> System.out.println("oc.getTitle() = " + oc.getTitle()));

        // 상수만
        OnlineClass onlineClass = spring.orElse(createNewClass());
        // 뭔가 작업도
        OnlineClass onlineClass1 = spring.orElseGet(OptionalExample::createNewClass);

        OnlineClass onlineClass2 = spring.orElseThrow(IllegalAccessError::new);

        Optional<OnlineClass> onlineClass3 = spring.filter(oc -> !oc.isClosed());

        Optional<Integer> integer = spring.map(OnlineClass::getId);

        Optional<Progress> progress = spring.flatMap(OnlineClass::getProgress);

    }

    private static OnlineClass createNewClass() {
        System.out.println("creating new online class");
        return new OnlineClass(10, "New class", false);
    }
}
