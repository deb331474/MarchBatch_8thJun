package propertiesDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo1 {

	public static void main(String[] args) throws IOException {

		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("config.properties");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("venki");
		System.out.println(s);
		p.setProperty("Debasish", "Pruseth");
		Enumeration e=p.propertyNames();
		while (e.hasMoreElements()) {
			Object object = (Object) e.nextElement();
			System.out.println(object);
		}
		
		FileOutputStream fos=new FileOutputStream("config.properties");
		p.store(fos, "updated by Debasish");
		
		
	}

}
