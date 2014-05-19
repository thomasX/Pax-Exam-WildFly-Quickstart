package main.java.org.ops4j.paxexam.wildfly.wildfly8.quickstart;


import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;


@Stateless
@TransactionManagement(TransactionManagementType.BEAN) 
public class HelloWorldBean implements HelloWorld {

		public String getGreeting(String name){
			return "Hallo " + name + " schön dich wiederzusehen! ";
		}
}
