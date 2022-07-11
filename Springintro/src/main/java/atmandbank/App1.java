package atmandbank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import component.Calculator1;
import component.Car1;
import component.CurrencyConvertor1;
import component.HelloWorld1;
import component.LoginService1;
import component.TextEditor1;
import atmandbank.Atm2_1;

public class App1 {

	public static void main(String[] args) {
		//Loading Spring/IOC Container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config1.xml");
		//Accessing a particular bean
		HelloWorld1 hw = (HelloWorld1) ctx.getBean("hello");
		System.out.println(hw.sayHello("Majrul"));
		//But why are we using Spring to create object of HelloWorld class?
		//We could have created object on our own like this:
		//HelloWorld hw = new HelloWorld();
		Calculator1 c = ctx.getBean("calc", Calculator1.class);
		System.out.println(c.add(10, 20));
		System.out.println(c.sub(10, 20));
		
		CurrencyConvertor1 cc = (CurrencyConvertor1) ctx.getBean("currencyConv");
		System.out.println(cc.convert("USD", "INR", 650));
		
		LoginService1 loginServ = (LoginService1) ctx.getBean("loginServ");
		System.out.println(loginServ.isValidUser("majrul", "456"));
	
		TextEditor1 te = (TextEditor1) ctx.getBean("txtEdtr");
		te.load("abc.txt");
		
		Car1 car = (Car1) ctx.getBean("car");
		car.drive();
		
		Atm2_1 atm = (Atm2_1) ctx.getBean("hdfcAtm-v2");
		atm.withdraw(20202020, 5000);
	}

}
