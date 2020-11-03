package day8;
import java.util.*;
public class ResourceBundleExample {

	public static void main(String[] args) throws MissingResourceException {
		// TODO Auto-generated method stub
		String resourceName="day8.default";
		ResourceBundle rb;
		//Default locale
		rb=ResourceBundle.getBundle(resourceName);
		System.out.println("Default :" +rb.getString("Hello.text"));
		//Request a resource bundle with explicitly specified local
		rb=ResourceBundle.getBundle(resourceName,Locale.GERMANY);
		System.out.println("German :" +rb.getString("Hello.text"));
		//No property file for China in this example...use default
		rb=ResourceBundle.getBundle(resourceName,Locale.CHINA);
		System.out.println("Chinese :" +rb.getString("Hello.text"));
		//An other way
		Locale.setDefault(Locale.FRANCE);
		rb=ResourceBundle.getBundle(resourceName);
		System.out.println("French :" +rb.getString("Hello.text"));
		
	}
}

