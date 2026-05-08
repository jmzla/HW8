package edu.brooklyn.cisc3130.campus_taskboard.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class PriorityValidator implements ConstraintValidator<ValidPriority, String> {

    private final List<String> validPriorities =
            List.of("LOW", "MEDIUM", "HIGH");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        if (value == null) {
            return false;
        }

        return validPriorities.contains(value.toUpperCase());
    }
}