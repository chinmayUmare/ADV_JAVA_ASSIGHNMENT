package component;



import org.springframework.stereotype.Component;

@Component("engine")
public class Engine1 {

	public void on() {
		System.out.println("vroom vroom..");
	}

	public void off() {
		System.out.println("phoosh phoosh..");
	}
}

