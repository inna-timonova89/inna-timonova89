package ru.job4j.tracker.tracker;

import javax.management.InstanceAlreadyExistsException;

public class TrackerSingletonClassLazyLoading {

    private TrackerSingletonClassLazyLoading() {
    }

    public static TrackerSingletonClassLazyLoading getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final TrackerSingletonClassLazyLoading INSTANCE = new TrackerSingletonClassLazyLoading();
    }

    public static void main(String[] args) {
        TrackerSingletonClassLazyLoading tracker = TrackerSingletonClassLazyLoading.getInstance();
    }
}
