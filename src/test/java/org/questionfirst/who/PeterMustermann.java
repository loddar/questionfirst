/*
 * Copyright (c) 2022.
 */

package org.questionfirst.who;

import org.questionfirst.qf.cls.Persona;

public class PeterMustermann implements Persona {
    @Override
    public String description() {
        return "Ich bin ein potenzieller Kunde und habe den Einkaufskorb gefüllt";
    }

    @Override
    public String bio() {
        return "Ich bin 51 Jahre jung und bin sehr gut versichert";
    }
}
