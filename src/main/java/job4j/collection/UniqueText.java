package job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String element : origin) {
            check.add(element);
        }
        for (String element : text) {
           if (!check.contains(element)) {
               rsl = false;
               break;
           }
        }
        return rsl;
    }
}
