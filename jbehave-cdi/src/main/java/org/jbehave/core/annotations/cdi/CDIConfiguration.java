package org.jbehave.core.annotations.cdi;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, METHOD, PARAMETER, FIELD})
@Inherited
@Qualifier
public @interface CDIConfiguration {

}
