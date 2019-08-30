package com.lovo.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 切面
 */
@Aspect
@Component
public class MyAspect {

    //通知
    @Before("execution(* com.lovo.*.service.IUserService.*(..))")
    public  void printTime(JoinPoint joinPoint){
        //连接点获得目标方法信息
      String str=  joinPoint.getSignature().getName();
        System.out.println("进入"+str+"方法的时间"+System.currentTimeMillis());
    }
}
