package org.example.observer;

import org.interfaces.Observer;
import org.interfaces.Subject;

import java.util.ArrayList;

public class PackageSubject implements Subject {
    private static PackageSubject instance;
    private ArrayList<Observer> observers;

    private String deliveryStatus;

    private PackageSubject() {
        this.observers = new ArrayList<>();
    }

    public static PackageSubject getInstance() {
        if (instance == null)
            instance = new PackageSubject();
        return instance;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0)
            observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(deliveryStatus);
        }
    }

    public void setDeliveryStatus(String newStatus) {
        this.deliveryStatus = newStatus;
        notifyObservers();
    }
}
