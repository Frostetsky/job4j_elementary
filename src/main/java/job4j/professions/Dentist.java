package job4j.professions;

public class Dentist extends Doctor {

    private int cabinet = 216;

    @Override
    public String getName() {
        return "Dentist";
    }

    @Override
    public int getCabinet() {
        return cabinet;
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

