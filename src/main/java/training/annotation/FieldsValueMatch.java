package training.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//@Documented
// annotation này chi có thê truy câp vào field
@Target({ ElementType.FIELD })
// anotation này có thông tin luu tru luc run time -> jre
@Retention(RetentionPolicy.RUNTIME)
//chi dinh classValidator
@Constraint(validatedBy = FieldsValueMatchValidator.class)
public @interface FieldsValueMatch {
	String message()

	default "Invalid Field";

	// this mean access Array of class object
	public Class<?>[] groups() default {};

	public Class<? extends Payload>[] payload() default {};

	// tao mot atrribute cho @FieldsValueMatch(matches={"fieldName"})
	public String[] matches() default {};

	public String match() default "";
}
