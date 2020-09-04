package job4j.professions;

public class Doctor extends Profession {

    private int cabinet = 204;

    @Override
    public String getName() {
        return "Doctor";
    }

    public int getCabinet() {
        return cabinet;
    }

    public String heal(Pacient pacient) {
        return null;
    }

    public String price(String service) {
        return null;
    }
}
