package exercises.annotation.qualifier.function;

import org.springframework.stereotype.Component;

@Component
public class Log implements MathFunction{

	@Override
	public double calculate(double arg) {
		return Math.log(arg);
	}

	@Override
	public String getName() {
		return "log";
	}
}
