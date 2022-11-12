package services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

import buisness.Bank;

public class LogAfterService implements AfterReturningAdvice{

	public void afterReturning(Object ret, Method mo, Object[] param, Object o) throws Throwable {

		Log l=LogFactory.getLog(Bank.class);
		l.info("deposit method...."+ret);
		
	}

}
