package exercises.javaConfig.calculator;

import exercises.javaConfig.calculator.function.MathFunction;
import exercises.javaConfig.calculator.function.Cos;
import exercises.javaConfig.calculator.function.Sin;
import exercises.javaConfig.calculator.function.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.bind.Name;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

	private MathFunction sin;
	private MathFunction cos;
	private MathFunction log;

	@Autowired
	public Calculator(Cos cos, Sin sin, Log log){
		this.cos=cos;
		this.sin=sin;
		this.log=log;
	}

	public double doCalculation(String functionName, double argument){
		MathFunction function = null;
		if(sin.getName().equals(functionName)) 
				function = sin;
		else if(cos.getName().equals(functionName)) 
			function = cos;
		else if(log.getName().equals(functionName)) 
			function = log;
		
		return function.calculate(argument);
	}


	//Lite Beanlerle yapılabilir
//	@Bean
//	public static Cos cos(){ //static olmak zorunda çünkü nesne oluşturulurken instance methodları çağırılamaz iken class(static) methodlar çağırılabilir
//		return new Cos();
//	}
//
//	@Bean
//	public static Sin sin(){
//		return new Sin();
//	}
//
//	@Bean
//	public static Log log(){
//		return new Log();
//	}
}
