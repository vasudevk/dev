package io.dev.core;

public class ThreadSafeSingleton {

    static volatile ThreadSafeSingleton singletonInstance;

    // private constructor to prevent outside access
    private ThreadSafeSingleton() {
    }

    // public static method to get the instance
    public static synchronized ThreadSafeSingleton getInstance() {
        if (null == singletonInstance)
            singletonInstance = new ThreadSafeSingleton();
        return singletonInstance;
    }

    // getInstance is not synchronized but the block which creates instance is synchronized so that
    // minimum number of threads have to wait and that’s only for first time.
    public static ThreadSafeSingleton getInstanceWithoutOverhead() {
        if (null == singletonInstance)
            synchronized (ThreadSafeSingleton.class) {
                singletonInstance = new ThreadSafeSingleton();
            }
        return singletonInstance;
    }
}