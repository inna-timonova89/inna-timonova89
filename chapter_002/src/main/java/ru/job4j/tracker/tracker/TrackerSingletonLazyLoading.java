package ru.job4j.tracker.tracker;

public class TrackerSingletonLazyLoading {

    private static TrackerSingletonLazyLoading instance;
    private TrackerSingletonLazyLoading() {
    }

    public static TrackerSingletonLazyLoading getInstance() {
        if (instance == null) {
            instance = new TrackerSingletonLazyLoading();
        }
        return instance;
    }
}
