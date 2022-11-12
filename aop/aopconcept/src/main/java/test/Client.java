package test;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import buisness.Bank;
import services.LogAfterService;
import services.LogAroundService;
import services.LogBeforeService;
import services.LogINExceptionService;

public class Client { 
	
	public static void main(String[] args) {
		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("test/config.xml");
		Bank bproxy=cap.getBean("proxy",Bank.class);
		//create target
//		Bank b=new Bank();
		//create advice before service
//		LogBeforeService lbs=new LogBeforeService();
		
		//create advice After service
//		LogAfterService las=new LogAfterService();
		
		//create advice Around service
//		LogAroundService las2=new LogAroundService();
		
//		LogINExceptionService lexc=new LogINExceptionService();
		//add target+advice to proxy
//		ProxyFactoryBean pfb=new ProxyFactoryBean();
//		pfb.setTarget(b);  
//		pfb.addAdvice(lbs);
		
//		pfb.setTarget(b);
//		pfb.addAdvice(las);
		
//		pfb.setTarget(b);
//		pfb.addAdvice(las2);
		
//		pfb.setTarget(b);
//		pfb.addAdvice(lexc);
		
		//get Generated proxy object
//		Bank bproxy=(Bank) pfb.getObject();
	 /*	int amount=bproxy.deposit("sbi123", 5000);
		System.out.println(amount);*/
		
		int amount2=bproxy.findBal("sbi123");
		System.out.println(amount2);
		cap.close();
	}
}
