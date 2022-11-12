package services;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import buisness.Bank;

public class LogAroundService implements MethodInterceptor{


	public Object invoke(MethodInvocation mi) throws Throwable {

		Log l=LogFactory.getLog(Bank.class);
		l.info("before deposit code....");
		Object ret = mi.proceed();
		l.info("after deposit code....");
		return ret;
	}

}
