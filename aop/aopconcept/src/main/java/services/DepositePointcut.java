package services;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class DepositePointcut extends StaticMethodMatcherPointcut {

	public boolean matches(Method m, Class c) {
		String methodName=m.getName();
		if(methodName.equals("deposite"))
			return true;
		else
			return false;
	}

}
