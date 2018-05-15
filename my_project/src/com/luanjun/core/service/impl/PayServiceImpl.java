package com.luanjun.core.service.impl;

import java.lang.reflect.Method;

import com.luanjun.core.annotation.BuyWay;
import com.luanjun.core.bean.BuyWayEnum;
import com.luanjun.core.service.PayService;

public class PayServiceImpl implements PayService {

	@Override
	public void pay() {
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		for (StackTraceElement e : stackTrace) {
			System.out.println(e.getClassName() + "\t" + e.getMethodName() + "\t" + e.getLineNumber());
		}
		StackTraceElement log = stackTrace[1];
		BuyWayEnum buyWayEnum = null;
		for (int i = 1; i < stackTrace.length; i++) {
			StackTraceElement e = stackTrace[i];
			if (!e.getClassName().equals(log.getClassName())) {
				try {
					for(Method method : Class.forName(e.getClassName()).getDeclaredMethods()){
						if(method.getName().equals(e.getMethodName())){
							if(method.isAnnotationPresent(BuyWay.class))
								buyWayEnum = method.getDeclaredAnnotation(BuyWay.class).value();
						}
					}
				} catch (SecurityException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			}
		}
		System.out.println(buyWayEnum);
	}

	
}
