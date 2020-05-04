package lambas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class DecOrderArray {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(){{
            add(1);
            add(5);
            add(2);
        }};

        System.out.println(numbers);

        Function<List, List> arrayReverser = s -> {
            Collections.sort(s);
            Collections.reverse(s);
            return s;
        };

        System.out.println(arrayReverser.apply(numbers));
    }
}
