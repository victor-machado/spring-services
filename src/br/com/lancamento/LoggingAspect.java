package br.com.lancamento;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.lancamento.service.EmployeeController;

@Aspect
public class LoggingAspect {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

//	@Before("execution(* br.com.lancamento.service.*.*(..))")
//	public void logBefore(JoinPoint joinPoint) {
//
//		logger.info(joinPoint.getSignature().getName() + " Start" + System.getProperty("line.separator") + "******");
//		logger.info(joinPoint.getSignature().getName() + " Params " + Arrays.toString(joinPoint.getArgs()) + System.getProperty("line.separator") + "******");
//	}
//
//	@AfterReturning(pointcut = "execution(* br.com.lancamento.service.*.*(..))", returning = "result")
//	public void logAfterReturning(JoinPoint joinPoint, Object result) {
//
//		logger.info(joinPoint.getSignature().getName() + " Returned " + result + System.getProperty("line.separator") + "******");
//	}

//	@After("execution(* br.com.lancamento.service.*.*(..))")
//	public void logAfter(JoinPoint joinPoint) {
//
//		logger.info(joinPoint.getSignature().getName() + " End" + System.getProperty("line.separator") + "******");
//	}
	
	@AfterThrowing(pointcut = "execution(* br.com.lancamento.service.*.*(..))", throwing = "error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

		logger.info(joinPoint.getSignature().getName() + " Error " + error + System.getProperty("line.separator") + "******");
	}

	@Around("execution(* br.com.lancamento.service.*.*(..))")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		logger.info(joinPoint.getSignature().getName() + " Start" + System.getProperty("line.separator") + "******");
		logger.info(joinPoint.getSignature().getName() + " Params " + Arrays.toString(joinPoint.getArgs()) + System.getProperty("line.separator") + "******");
		Object result = joinPoint.proceed();
		logger.info(joinPoint.getSignature().getName() + " Returned " + result + System.getProperty("line.separator") + "******");
		logger.info(joinPoint.getSignature().getName() + " End" + System.getProperty("line.separator") + "******");
		return result;

	}	
}













