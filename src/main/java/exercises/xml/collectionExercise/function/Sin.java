package exercises.xml.collectionExercise.function;

public class Sin implements MathFunction{

	@Override
	public double calculate(double arg) {
		return Math.sin(arg);
	}
}
