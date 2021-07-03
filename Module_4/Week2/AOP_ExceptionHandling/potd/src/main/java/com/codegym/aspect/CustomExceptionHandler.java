package com.codegym.aspect;
import com.codegym.exception.BadWordException;
import com.codegym.exception.NotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(BadWordException.class)
    public ModelAndView showBadWordError(){
        return new ModelAndView("/bad-word");
    }
    @ExceptionHandler(NotFoundException.class)
    public ModelAndView showError404(){
        return new ModelAndView("/error-404");
    }
}
