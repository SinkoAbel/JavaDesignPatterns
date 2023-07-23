package org.example.observer;

import org.interfaces.EngineDriveHealth;

public class GoodEngineDriveHealth implements EngineDriveHealth {
    @Override
    public void HealthStatus() {
        System.out.println("Your chain drive is fine as new!\n");
    }
}
