package lambas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ListCleanExampler {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(){{
            add(1);
            add(2);
            add(5);
        }};

        System.out.println(numbers);

        Function<List, List> fiveDeleter = s -> {
            s.remove(Integer.valueOf(5));
            return s;
        };
        List<Integer> numbersWithoutFive = fiveDeleter.apply(numbers);

        System.out.println(numbersWithoutFive);
    }
}
