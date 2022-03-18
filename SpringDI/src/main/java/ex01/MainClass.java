package ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		/*
		SpringTest s = new SpringTest();
		s.test();
		*/
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("application-context.xml");
		
		SpringTest s = ctx.getBean(SpringTest.class);
		s.test();
		
		SpringTest s2 = ctx.getBean(SpringTest.class);
		s2.test();
		
		//IOC컨테이너 안에 만들어지는 객체는 자동으로 싱글톤 형식을 가집니다.
		//scope="prototype" 을 기술하면 빈을 사용할때마다 다른 객체로 생성합니다.
		System.out.println(s.equals(s2));
		
//		SpringTest2 s2 = ctx.getBean(SpringTest2.class);
//		s2.test();
	}
}
