package exercises.xml.collectionExercise;

import exercises.xml.collectionExercise.function.MathFunction;

import java.util.Map;


public class Calculator implements CalculatorI{
	private Map<String, MathFunction> functions;
	
	public void setFunctions(Map<String, MathFunction> functions) {
		this.functions = functions;
	}

	@Override
	public double doCalculation(String functionName, double argument){
		MathFunction function = functions.get(functionName);
		return function.calculate(argument);
	}
}
