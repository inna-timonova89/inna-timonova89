package ru.job4j.tracker.tracker;

public class TrackerSingletonEagerLoading {
    private static final TrackerSingletonEagerLoading INSTANCE = new TrackerSingletonEagerLoading();

    private TrackerSingletonEagerLoading() {
    }

    public static TrackerSingletonEagerLoading getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        TrackerSingletonEagerLoading tracker = TrackerSingletonEagerLoading.getInstance();
    }
}
