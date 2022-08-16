package exercises.annotation.qualifier;

import exercises.annotation.qualifier.function.MathFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

	//	@Autowired
	//	@Qualifier("sin") // Bu şekilde field based injection da yapılabilir
	private MathFunction sin;

	//	@Autowired
	//	@Qualifier("cos") // Bu şekilde field based injection da yapılabilir
	private MathFunction cos;

	//	@Autowired
	//	@Qualifier("log") // Bu şekilde field based injection da yapılabilir
	private MathFunction log;

	//constructor based injection
	@Autowired
	//parametre isimleri doğru classları belirttiğinden @Qualifier'lara aslında gerek yoktur
	public Calculator(@Qualifier("sin") MathFunction sin, @Qualifier("cos") MathFunction cos, @Qualifier("log") MathFunction log){
		this.sin=sin;
		this.cos=cos;
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

	//setter based injection
//	@Autowired
//	public void setCos(@Qualifier("cos") MathFunction cos) {
//		this.cos = cos;
//		System.out.println("setter");
//	}
//	@Autowired
//	public void setLog(@Qualifier("log") MathFunction log) {
//		this.log = log;
//	}
//	@Autowired
//	public void setSin(@Qualifier("sin") MathFunction sin) {
//		this.sin = sin;
//	}
}
