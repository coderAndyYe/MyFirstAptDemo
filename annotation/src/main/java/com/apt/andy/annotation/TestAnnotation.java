package com.apt.andy.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2018/1/24 0024.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface TestAnnotation {
}
