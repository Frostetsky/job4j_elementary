package ru.job4j.professions;

public class Engineer extends Profession {

    @Override
    public String getName() {
        return "Engineer";
    }

    public void projectImplementation(Project project) {

    }

    public int priceProject() {
        return 0;
    }
}
