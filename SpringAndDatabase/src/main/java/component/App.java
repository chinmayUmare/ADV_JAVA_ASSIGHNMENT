package component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import component.CarPart;
import component.CarPartsInventory;
//import component.CarPartsInventoryImpl2;
import component.CarPartsInventoryImpl1;

public class App {

	public static void main(String[] args) {
		//Loading Spring/IOC Container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		
		CarPartsInventory inv = (CarPartsInventory) ctx.getBean("carParts1");
		
		//model/entity classes are not instantiated using Spring
		CarPart cp = new CarPart();
		cp.setPartName("handle");
		cp.setCarModel("vista");
		cp.setPrice(100);
		cp.setQuantity(5);
		
		inv.addNewPart(cp);
		long ms1 = System.currentTimeMillis();
		inv.addNewPart(cp);
		long ms2 = System.currentTimeMillis();
		System.out.println("Total time taken : " + (ms2 - ms1) + " ms approx");
		
	}

}