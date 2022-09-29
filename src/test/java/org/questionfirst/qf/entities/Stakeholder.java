/*
 * Copyright (c) 2018-2022.
 */
package org.questionfirst.qf.entities;

/**
 * Stakeholder is 
 */
public interface Stakeholder {
    default String bio() { return "No bio yet";}

    default String description() { return "No description";}


    
    default Intentions[] intentions() { return new Intentions[]{}; }

    interface Intentions {
        default String description() { return "No description yet";}
    }

    class None implements Intentions {
    }
}
