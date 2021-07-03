package com.codegym.aspect;

import com.codegym.exception.BadWordException;
import com.codegym.model.Comment;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class Logger {
    @AfterThrowing(pointcut = "execution(* com.codegym.controller.PictureController.saveComment(..))",throwing = "e")
    public void log(JoinPoint joinPoint, BadWordException e) {
//        String className = joinPoint.getTarget().getClass().getSimpleName();
//        String method = joinPoint.getSignature().getName();
//        String args = Arrays.toString(joinPoint.getArgs());
        Object[] args1 = joinPoint.getArgs();
        Comment comment = (Comment) args1[0];
        System.out.println(String.format("Lỗi rồi má ơi, nhập lại giùm con dữ liệu: Author:%s - Feed Back:%s - Date:%s: %s", comment.getAuthor(), comment.getFeedBack(), comment.getDates(), e.getMessage()));
    }
}
