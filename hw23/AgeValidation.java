package hw23;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AgeValidation {
    int minAge() default 0;
    int maxAge() default Integer.MAX_VALUE;
    String message() default "Неприпустимий вік";
}