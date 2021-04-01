package com.PostProcessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"/beans/PostProcessor/Bean.xml");

      Helloworld obj1 = (Helloworld) context.getBean("helloWorld");
      obj1.getMessage();
      Helloindia obj2 = (Helloindia) context.getBean("helloIndia");
      obj2.getMessage();
      
      // Bean will be destroyed by using any of following calls.
      //context.registerShutdownHook();
      context.close();
      //context.destroy();
   }
}