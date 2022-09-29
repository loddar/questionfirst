/*
 * Copyright (c) 2022.
 */

package org.questionfirst.qf.entities;


public interface XQuestion {
    String question();
    default String description() { return "No description yet";}

    default Stakeholder[] who() { return new Stakeholder[]{}; }

    default XQuestion[] specific() { return new XQuestion[] {}; }

    default XQuestion[] derivedFrom() { return new XQuestion[]{}; }

    default Answer[] answers() { return new Answer[]{}; }
}
