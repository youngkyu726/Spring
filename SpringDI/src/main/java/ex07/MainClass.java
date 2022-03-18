package ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex01.SpringTest;
import ex02.Hotel;

public class MainClass {

	public static void main(String[] args) {
		
		//자바파일을 설정파일로 쓸때는 GenericApplicationContext를 상속받는
		//아래 클래스를 사용함
		
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		SpringTest st = ctx.getBean(SpringTest.class);
		st.test();
		
		Hotel ht = ctx.getBean(Hotel.class);
		ht.getChef().cooking();
	}
}
