/*
 * Copyright (c) 2022.
 */

package org.questionfirst.questions;

import org.questionfirst.qf.entities.Stakeholder;
import org.questionfirst.qf.entities.XQuestion;
import org.questionfirst.who.BigBoss;

public class HandleMultipleCurrencies implements XQuestion {
    @Override
    public String question() {
        return "How to handle multiple currencies starting with CHF/EURO?";
    }

    @Override
    public String description() {
        return "Is is necessary to handle multiple currencies, because with starting 2023, we are expanding to EU.";
    }

    @Override
    public Stakeholder[] who() {
        return new Stakeholder[]{new BigBoss()};
    }
}
