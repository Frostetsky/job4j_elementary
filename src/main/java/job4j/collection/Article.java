package job4j.collection;

import java.util.*;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean result = true;
        String neworigin = origin.replaceAll( "\\p{Punct}","");
        String[] array = neworigin.split(" ");
        String[] array2 = line.split(" ");
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set,array);
        for (int i = 0; i < array2.length; i++) {
            if (!set.contains(array2[i])) {
                result = false;
                break;
            }
        }
        return result;
    }
}

