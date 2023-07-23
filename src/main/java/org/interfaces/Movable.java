package org.interfaces;

public interface Movable {
    void Move(int increaseSpeedKmph);

    void Stop();

    String CurrentSpeed();
}
