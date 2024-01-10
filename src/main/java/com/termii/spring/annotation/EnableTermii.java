package com.termii.spring.annotation;

import com.termii.spring.configuration.ApplicationConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({ApplicationConfiguration.class})
public @interface EnableTermii {
}
