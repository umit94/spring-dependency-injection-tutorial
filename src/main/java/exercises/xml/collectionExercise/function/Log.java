package exercises.xml.collectionExercise.function;

public class Log implements MathFunction{

	@Override
	public double calculate(double arg) {
		return Math.log(arg);
	}
}
