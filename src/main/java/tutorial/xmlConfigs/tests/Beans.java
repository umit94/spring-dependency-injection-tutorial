package tutorial.xmlConfigs.tests;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Beans {
	public static void main(String[] args) {
		

		System.out.println("\nConstructor calls start"); //default olarak xml içerisindeki tüm beanlerin constructor çağrıları ApplicationContext nesnesi oluşturulduğunda yapılır
		ApplicationContext context = new ClassPathXmlApplicationContext("tutorial\\beans.xml");
		System.out.println("\nConstructor calls end");

		Object o = context.getBean("beanA"); //BeanA nesnesi oluşturulurken BeanB nesnesini de oluşturur ve BeanA nesnesi içerisindeki set methoduyla set eder.
		System.out.println(o.toString());

		o = context.getBean("beanOverrideTest"); //Override edildiği için BeanB nesnesi çağırılır
		System.out.println(o.toString());

		o = context.getBean("tutorial.xmlConfig.BeanB"); // id ve name'i olmayan beanleri fully qualified name ile çağırabiliriz
		System.out.println(o.toString());

		o = context.getBean("child"); // beanA'nın calculator.xml'de verilen propertylerini extend eden child
		System.out.println(o.toString());

//		o = context.getBean("abstractClass"); // abstractların constructor çağırısı yapılmaz, exception fırlatır


	}

}
