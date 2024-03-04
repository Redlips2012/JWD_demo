package training.annotation;

import java.lang.reflect.Field;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FieldsValueMatchValidator implements ConstraintValidator<FieldsValueMatch, String> {

	private String[] fieldsToMatch;

	// this method initialize the validator
	@Override
	public void initialize(FieldsValueMatch constraintAnnotation) {
		// o đây lây giái tri trong matches={A,B,C} găn vào fieldsToMatch
		fieldsToMatch = constraintAnnotation.matches();
	}

	// String object is the field annotated by
	@Override
	public boolean isValid(String object, ConstraintValidatorContext context) {
		for (String fieldName : fieldsToMatch) {
			try {
				// Retrieve field using reflection
				object = object.trim();
				
				//the the field of the field name in @FieldsValueMatch(Match ={"A","B"})
				Field field = object.getClass().getDeclaredField(fieldName);
				field.setAccessible(true);// AccessField with private
				String fieldValue = ((String) field.get(object)).trim();// get the value
				if (object != null && fieldValue != null && !object.equals(fieldValue)) {
					return false;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return true;
	}
}
