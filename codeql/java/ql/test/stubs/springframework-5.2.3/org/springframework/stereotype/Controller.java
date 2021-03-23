package org.springframework.stereotype;

import java.lang.annotation.*;

@Target(value=ElementType.TYPE)
@Retention(value=RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Controller { }
