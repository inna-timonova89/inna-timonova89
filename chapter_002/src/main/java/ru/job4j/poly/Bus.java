package ru.job4j.poly;

public class Bus implements Transport {
    double price;
    @Override
    public boolean drive() {
        return false;
    }

    @Override
    public String passengers(int passengers) {
        return null;
    }

    @Override
    public double fuel(double fuel) {
        return price;
    }
}
