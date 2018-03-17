/*
 * Copyright (c) 2018.
 */
package org.questionfirst.who;

/**
 * Stakeholder is responsible for ...
 */
public interface Stakeholder {
    default String bio() { return "No bio yet";}
    
    default Intentions[] intentions() { return new Intentions[]{new None()}; }

    interface Intentions {
        default String description() { return "No description yet";}
    }

    class None implements Intentions {
    }
}
