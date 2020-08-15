package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = person -> person.getPhone().equals(key)
                                           || person.getAddress().equals(key)
                                           || person.getSurname().equals(key)
                                           || person.getName().equals(key);
        ArrayList<Person> result = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            if (combine.test(persons.get(i))) {
                result.add(persons.get(i));
            }
        }
        return result;
    }
}
