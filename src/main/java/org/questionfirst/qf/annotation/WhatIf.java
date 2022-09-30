/*
 * Copyright (c) 2022.
 */

package org.questionfirst.qf.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Documented
public @interface WhatIf {
    String value();
}
