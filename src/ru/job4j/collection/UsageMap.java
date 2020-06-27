package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("andrey-borchenko@mail.ru", "Borchenko Andrey Sergeevich");
        map.put("nesterenko-nikita@bk.ru", "Nesterenko Nikita Aleksandrovich");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("Mail: " + key + " | " + "FIO: " + value);
        }
    }
}
