package ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MaincClass {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("autowired-context.xml");
		
		Airplane ap = ctx.getBean(Airplane.class);
		ap.getBattery().energy();
	}
}
