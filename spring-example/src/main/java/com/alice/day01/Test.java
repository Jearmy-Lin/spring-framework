package com.alice.day01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Alice
 * @date 2024/03/19 15:54
 **/
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				context = new AnnotationConfigApplicationContext();
		context.refresh();
		System.out.println("Hello, World!");
	}
}
