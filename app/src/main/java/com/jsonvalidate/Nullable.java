package com.jsonvalidate;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;

/**
 * Created by nabilulaleem.md on 06-06-2018.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={FIELD, PARAMETER})
public @interface Nullable {

}
