package com.arvind.home.aop;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class PerformanceAspect {
	
	public void switchCellPhoneToMute(){
		System.out.println("switching the cellphone to mute");
	}
	
	public void stopTalking() {
		System.out.println("Stop talking now...Play is about to start");
	}
	
	public void applaud() {
		System.out.println("What a great performance it was..clap clap");
	}
	
	public void refund() {
		System.out.println("I need my money bakc...The play sucked");
	}

}
