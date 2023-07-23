package org.example.uml;

import org.interfaces.BarkBehaviour;

abstract class Animal implements BarkBehaviour {
    public String name;

    public abstract void Bark();
}
