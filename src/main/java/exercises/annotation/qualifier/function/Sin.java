package exercises.annotation.qualifier.function;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Sin implements MathFunction{

	@Override
	public double calculate(double arg) {
		return Math.sin(arg);
	}

	@Override
	public String getName() {
		return "sin";
	}
}
