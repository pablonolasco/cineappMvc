package pruebas.jpa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.org.apache.bcel.internal.util.ClassPath;

public class AppConexion {

	public static void main(String [] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("root-context.xml");
		context.close();
		
		
	}
}
