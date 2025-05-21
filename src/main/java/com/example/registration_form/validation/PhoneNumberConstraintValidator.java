package com.example.registration_form.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberConstraintValidator implements ConstraintValidator<PhoneNumber, String> {

    private String prefix;

    @Override
    public void initialize(PhoneNumber phoneNumber) {
        this.prefix = phoneNumber.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s == null) {
            return false;
        }
        return s.startsWith(this.prefix);
    }
}