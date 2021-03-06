package com.codegym.model;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class Phone implements Validator{
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Phone.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Phone phone = (Phone) target;
        String phoneNumber = phone.getNumber();
        ValidationUtils.rejectIfEmpty(errors, "number","number.empty");
        if(phoneNumber.length()>11 || phoneNumber.length()<10){
            errors.rejectValue("number","number.length");
        }
        if(!phoneNumber.startsWith("0")){
            errors.rejectValue("number","number.startsWith");
        }
        if(!phoneNumber.matches("(^$|[0-9]*$)")){
            errors.rejectValue("number","number.matches");
        }

    }
}
