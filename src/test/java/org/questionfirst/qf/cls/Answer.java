/*
 * Copyright (c) 2022.
 */

package org.questionfirst.qf.cls;

public interface Answer {
    XQuestion answerTo();

    String description();

    XQuestion[] questions();
}
