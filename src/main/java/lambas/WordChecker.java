package lambas;

import java.util.function.Predicate;

public class WordChecker {

    private static final String VITYA = "Витя";

    public static void main(String[] args) {
        checkWord(s -> {
            String newName = s + "Коля";
            return newName.length() < 10;
        }, VITYA);

        checkWord(s -> s.contains("б"), VITYA);
        checkWord(s -> s.length() < 5, VITYA);

    }

    private static boolean checkWord(Predicate<String> predicate, String word) {
        return predicate.test(word);
    }
}
