package org.example.observer;

import org.interfaces.EngineDriveHealth;

public class BadEngineDriveHealth implements EngineDriveHealth {
    @Override
    public void HealthStatus() {
        System.out.println("Your chain is clanking. You should replace or tighten it asap!\n");
    }
}
