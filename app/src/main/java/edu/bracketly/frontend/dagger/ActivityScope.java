package edu.bracketly.frontend.dagger;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Piotr Borczyk on 20.12.2017.
 */

@Scope
@Retention(RUNTIME)
public @interface ActivityScope {}