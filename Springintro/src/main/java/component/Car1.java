package component;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("car")
public class Car1 {

	// this step is used if you don't want to write 'getbean' method 
	@Autowired // DI
	private Engine1 engine;
	
	public void drive() {
		engine.on();
		engine.off();
	}
}

