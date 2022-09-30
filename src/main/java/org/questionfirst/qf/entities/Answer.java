/*
 * Copyright (c) 2022.
 */

package org.questionfirst.qf.entities;

public interface Answer {
    XQuestion answerTo();

    String description();

    XQuestion[] questions();
}
