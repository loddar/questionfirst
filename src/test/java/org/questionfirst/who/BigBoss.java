/*
 * Copyright (c) 2018.
 */
package org.questionfirst.who;

/**
 * BigBoss is responsible for ...
 */
public class BigBoss implements Stakeholder {
    @Override
    public String bio() {
        return "I'm the Big Boss and I'm the best ever lived on earth. Working at leat 48 h the day. And my biggest buddy is D. Trump.";
    }

    @Override
    public Intentions[] intentions() {
        return new Intentions[] { //
            new BigBoss.AsCheapAsPossible(), //
            new BigBoss.DeliveredYesterday(), //
                new BigBoss.OurCustomersAreInSwitzerlandAndEu(), //
        };
    }

    public class OurCustomersAreInSwitzerlandAndEu implements Intentions {
    }

    private class AsCheapAsPossible implements Intentions {
    }

    private class DeliveredYesterday implements Intentions {
    }
}
