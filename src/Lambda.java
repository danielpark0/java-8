import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Lambda {
    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        lambda.run();
    }

    private void run() {
        int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                System.out.println("baseNumber = " + baseNumber);
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("baseNumber = " + baseNumber);
            }
        };

        //람다
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };

        printInt.accept(10);
    }


}
