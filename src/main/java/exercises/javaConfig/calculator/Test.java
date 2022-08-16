package exercises.javaConfig.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("exercises/javaConfig/calculator")
public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
		Calculator calculator = (Calculator) context.getBean("calculator");
		
		System.out.println(calculator.doCalculation("sin", 2*Math.PI*30/360));
		System.out.println(calculator.doCalculation("cos", 2*Math.PI*30/360));
		System.out.println(calculator.doCalculation("log", 2.71828));

	}
}
