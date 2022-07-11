package component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("txtEdtr")
public class TextEditor1 {
	
	//for getting the object of any class we used '@Autowired', it means that in 'TextEditor1' class we need object of 'SpellChecker1' class , then we write '@Autowired'
	@Autowired //DI (Dependencies Injection)
	private SpellChecker1 sp;
	
	public void load(String document) {
		System.out.println("some code here for loading " + document);
		//from here we want to invoke the spell checker
		//SpellChecker sp = new SpellChecker();
		//but we want Spring to create the required object for us, and for that we write '@component' above class
		sp.checkSpellingMistakes(document);
	}
}
