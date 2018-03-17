/*
 * Copyright (c) 2018.
 */
package org.questionfirst.example;


import org.junit.Test;
import org.questionfirst.annotation.Question;
import org.questionfirst.who.BigBoss;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@Question(questions = {"How to store and calculate multiple currencies starting with CHF/EURO?"}, who = {BigBoss.class}, //
        why = BigBoss.OurCustomersAreInSwitzerlandAndEu.class//
)
public class CurrencyTest {
    @Question(questions = {"How to ..."}, who = {BigBoss.class})
    @Test
    public void test() {
        assertThat("Nothing to check", is("not yet"));
    }
}
