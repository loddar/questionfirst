/*
 * Copyright (c) 2018.
 */
package org.questionfirst.annotation;

import org.questionfirst.who.Stakeholder;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;


@Target({ElementType.METHOD, ElementType.TYPE})
@Repeatable(Question.Questions.class)
@Documented
public @interface Question {

    String[] value() default {"Please ask!"};

    String[] questions() default {};

    Class<? extends Stakeholder>[] who() default {};

    Class<? extends Stakeholder.Intentions>[] why() default {};

    @Target({ElementType.METHOD, ElementType.TYPE})
    @Documented
    public @interface Questions {
        Question[] value();
    }
}
