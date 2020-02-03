package com.qa.tutorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class InteractionTest {
	@Test
	public void greetingtest() {
		Interaction interaction = new Interaction();
		
		assertEquals("Hi Friend", interaction.greeting());
	}
	
}
