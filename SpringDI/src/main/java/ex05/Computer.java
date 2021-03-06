package ex05;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Computer {
	
	@Autowired
	@Qualifier("mos")
	private Mouse mouse;
	@Autowired
	@Qualifier("kb")
	private Keyboard kb;
	@Autowired
	@Qualifier("mon")
	private Monitor monitor;
	
	public void computerInfo() {
		System.out.println("***컴퓨터 정보***");
		mouse.info();
		kb.info();
		monitor.info();
	}

	@Override
	public String toString() {
		return "Computer [mouse=" + mouse + ", kb=" + kb + ", monitor=" + monitor + "]";
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Keyboard getKb() {
		return kb;
	}

	public void setKb(Keyboard kb) {
		this.kb = kb;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	
	
}
