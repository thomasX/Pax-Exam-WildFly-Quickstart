Pax-Exam-WildFly-Quickstart
===========================

A Quickstart-Example for PaxExam on Wildfly 8.1.0.CR1

this quickstart example  could be a template for in-container testing on wildfly !




For Eclipse Users: 
If you start Junit-Tests directly from the eclipse-IDE, you will get an OutOfMemmory Error !

There are 2 workarounds for this Problem: 
    	
Workaround 1:  

install the junitLauncher-plugin
this plugin allows you, to define default (Xmx and XX:MaxPermSize) arguments for all JunitTests
			 
			 http://junitlaunchfixer.googlecode.com/svn/trunk/JUnitLaunchFixer-update-site/.


			 
Workaround 2:

Edit the Run-Configuration:   
Write into the Field 'VM-arguments' of the Tab (x)-Arguments the following String: '-XX:MaxPermSize=256m'
    	   
    	   
    	 