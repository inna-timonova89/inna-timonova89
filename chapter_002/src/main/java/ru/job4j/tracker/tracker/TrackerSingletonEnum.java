package ru.job4j.tracker.tracker;

public enum TrackerSingletonEnum {
    INSTANCE;

    public static void main(String[] args) {
        TrackerSingletonEnum tracker = TrackerSingletonEnum.INSTANCE;
    }
}
