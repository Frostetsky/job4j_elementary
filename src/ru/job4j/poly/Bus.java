package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Bus is driving");
    }

    @Override
    public void passenger(int numberPassengers) {
        System.out.println("Maximum number of passengers " + numberPassengers);
    }

    @Override
    public double fillUp(long fuel) {
        return fuel * 41.34;
    }
}
