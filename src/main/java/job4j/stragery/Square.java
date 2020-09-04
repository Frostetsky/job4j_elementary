package job4j.stragery;

public class Square implements Shape{
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return "--------" + ln +
                "|      |" + ln +
                "|      |" + ln +
                "--------";

    }
}
