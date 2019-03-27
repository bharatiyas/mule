package com.skb.learn.mule.invoker;

public class Invoker {

	public String getFullName(String firstName, String lastName) {
		
		System.out.println("Full name is: " + firstName + " " + lastName);
		return firstName + " " + lastName;
	}
}
