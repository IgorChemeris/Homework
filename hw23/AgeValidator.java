package hw23;

import java.lang.reflect.Field;

public class AgeValidator {
    public static void validateAge(Object object) throws IllegalAccessException {
        Field[] fields = object.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(AgeValidation.class)) {
                field.setAccessible(true);
                int age = field.getInt(object);
                AgeValidation annotation = field.getAnnotation(AgeValidation.class);

                if (age < annotation.minAge() || age > annotation.maxAge()) {
                    throw new IllegalArgumentException(annotation.message());
                }
            }
        }
    }
}