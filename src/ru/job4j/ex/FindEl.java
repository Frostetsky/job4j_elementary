package ru.job4j.ex;

public class FindEl {

    private static String[] array = {"Petr", "Nikita", "Aleksandr"};

    public static void main(String[] args) {
        try {
           int result = indexOf(array, "Dima");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            } else {
                throw new ElementNotFoundException("Element not found");
            }
        }
        return rsl;
    }
}
