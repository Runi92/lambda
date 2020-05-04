package usages;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsUsager {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(){{
            add("Ваня");
            add("Коля");
            add("Александр");
        }};

        System.out.println(
                names.stream().filter(s -> s.length() < 5).collect(Collectors.toList())
        );

    }
}
