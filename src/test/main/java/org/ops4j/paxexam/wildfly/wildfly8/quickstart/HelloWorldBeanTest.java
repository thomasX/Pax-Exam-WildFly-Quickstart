package test.main.java.org.ops4j.paxexam.wildfly.wildfly8.quickstart;


import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import main.java.org.ops4j.paxexam.wildfly.wildfly8.quickstart.HelloWorldBean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.junit.PaxExam;


@RunWith(PaxExam.class)
public class HelloWorldBeanTest {

	@Inject HelloWorldBean bean;
	
	@Test
	public void testTom(){
		String result=bean.getGreeting("Mario");
		assertEquals("Hallo Mario schön dich wiederzusehen!",result);
	}
	
	
}
