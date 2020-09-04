package ru.job4j.professions;

public class Programmer extends Engineer {

    @Override
    public void projectImplementation(Project project) {

    }

    @Override
    public String getName() {
        return "Programmer";
    }

    @Override
    public int priceProject() {
        return 156_000;
    }
}
