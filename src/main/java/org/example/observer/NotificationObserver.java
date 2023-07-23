package org.example.observer;

import org.interfaces.Observer;
import org.interfaces.Subject;

public class NotificationObserver implements Observer {
    private String currentStatus;
    private Subject subject;

    public NotificationObserver(PackageSubject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String status) {
        this.currentStatus = status;
        System.out.println("Delivery status changed to: " + currentStatus);
    }
}
