package functioal_interfaces;

import java.util.function.Predicate;

public class PredicateExampler {
    public static void main(String[] args) {
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("И");
            }
        };

        System.out.println(predicate.test("Дима"));
        System.out.println(predicate.test("Ваня"));
        System.out.println(predicate.test("Игорь"));
    }
}
