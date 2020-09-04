package ru.job4j.professions;

public class Surgeon extends Doctor {

    private int cabinet = 209;

    @Override
    public int getCabinet() {
        return cabinet;
    }

    @Override
    public String getName() {
        return "Surgeon";
    }

    @Override
    public String heal(Pacient pacient) {
        return null;
    }

    @Override
    public String price(String service) {
        return null;
    }
}

