package org.example.observer;

import org.interfaces.EngineDriveHealth;

public class Motorcycle {
    protected EngineDriveHealth engineDriveHealth;

    public void engineDriveHealthStatus() {
        engineDriveHealth.HealthStatus();
    }

    public void setEngineDriveHealth(EngineDriveHealth engineDriveHealth) {
        this.engineDriveHealth = engineDriveHealth;
    }
}
