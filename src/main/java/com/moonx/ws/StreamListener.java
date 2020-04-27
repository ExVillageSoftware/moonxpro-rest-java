package com.moonx.ws;

public interface StreamListener {
    void delta(Data data);

    void snapshot(Data data);

    default void disconnected() {}

    default void data(Data data) {
        if (data.type() == Type.Snapshot) {
            snapshot(data);
        } else {
            delta(data);
        }
    }
}