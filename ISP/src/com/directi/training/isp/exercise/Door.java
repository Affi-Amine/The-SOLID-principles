package com.directi.training.isp.exercise;

public interface LockableDoor {
    void lock();
    void unlock();
}

public interface OpenableDoor {
    void open();
    void close();
}

public interface TimeOutListener {
    void timeOutCallback();
}

public interface ProximityListener {
    void proximityCallback();
}
