/*
 * Copyright (c) 2018-2022.
 */
package org.questionfirst.who;

import org.questionfirst.qf.entities.Stakeholder;

/**
 * BigBoss is
 */
public class BigBoss implements Stakeholder {
    @Override
    public String bio() {
        return "I'm the Big Boss and I'm the best ever lived on earth. Working at leat 48 h the day.";
    }

    @Override
    public Stakeholder.Intentions[] intentions() {
        return new Stakeholder.Intentions[] { //
                new AsCheapAsPossible(), //
                new DeliveredYesterday(), //
                new OurCustomersAreInSwitzerlandAndEu(), //
        };
    }

    public static class OurCustomersAreInSwitzerlandAndEu implements Intentions {
    }

    private static class AsCheapAsPossible implements Intentions {
    }

    private static class DeliveredYesterday implements Intentions {
    }
}
