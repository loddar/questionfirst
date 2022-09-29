/*
 * Copyright (c) 2022.
 */

package org.questionfirst.qf.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Documented
public @interface HowTo {
    String value();
}
