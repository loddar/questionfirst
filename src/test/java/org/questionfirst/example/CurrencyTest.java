/*
 * Copyright (c) 2018-2022.
 */
package org.questionfirst.example;


import org.junit.jupiter.api.Test;
import org.questionfirst.qf.annotation.WhatIf;
import org.questionfirst.qf.annotation.AQuestion;
import org.questionfirst.qf.annotation.HowTo;
import org.questionfirst.questions.HandleMultipleCurrencies;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


@AQuestion(xquestion = HandleMultipleCurrencies.class)
class CurrencyTest {
    @HowTo("How to ...")
    @Test
    void test1() {
        assertThat("Nothing to check", is("not yet"));
    }

    @WhatIf("What if ...")
    @Test
    void test2() {
        assertThat("Nothing to check", is("not yet"));
    }
}
