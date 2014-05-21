package org.ops4j.paxexam.wildfly.wildfly8.quickstart;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.junit.PaxExam;

@RunWith(PaxExam.class)
public class HelloWorldBeanTest {
	//TODO Test 20.05.2014
	
	@Inject HelloWorld bean;
	
	@Test
	public void testGetGreeting(){
		assertEquals("Hallo Mario sch�n dich wiederzusehen! ", bean.getGreeting("Mario"));
		assertEquals("Hallo Mario sch�n dich wiederzusehen!","Hallo Mario sch�n dich wiederzusehen!");
	}
	
	@Test
	public void testGetGreeting2(){
		assertEquals("Hallo Mario sch�n dich wiederzusehen!","Hallo Mario sch�n dich wiederzusehen!");
	}
	
	@Test
	public void testGetGreeting3(){
		assertEquals("Hallo Mari�o sch�n dich wiederzusehen!","Hallo Mario sch�n dich wiederzusehen!");
	}
	
	
	
	
}
