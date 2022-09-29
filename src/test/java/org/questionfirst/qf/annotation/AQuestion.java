/*
 * Copyright (c) 2018-2022.
 */
package org.questionfirst.qf.annotation;

import org.questionfirst.qf.entities.Stakeholder;
import org.questionfirst.qf.entities.XQuestion;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;


@Target({ElementType.METHOD, ElementType.TYPE})
@Repeatable(AQuestion.Questions.class)
@Documented
public @interface AQuestion {

    String value() default "Please ask!";


    Class<? extends XQuestion>[] xquestion() default {};

    Class<? extends Stakeholder>[] who() default {};

    Class<? extends Stakeholder.Intentions>[] why() default {};

    @Target({ElementType.METHOD, ElementType.TYPE})
    @Documented
    public @interface Questions {
        AQuestion[] value();
    }
}
