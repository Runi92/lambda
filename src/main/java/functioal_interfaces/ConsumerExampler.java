package functioal_interfaces;

import java.util.function.Consumer;

public class ConsumerExampler {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toLowerCase());
                System.out.println(s.toUpperCase());
            }
        };

        consumer.accept("Dima");

    }
}
