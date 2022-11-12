package services;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

import buisness.Bank;

public class LogINExceptionService implements ThrowsAdvice{


	public void afterThrowing(Exception ex) throws Throwable {

		Log l=LogFactory.getLog(Bank.class);
		l.info("incase of exception in deposit:");
	}

}
