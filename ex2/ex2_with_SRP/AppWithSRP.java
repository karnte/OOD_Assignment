public class AppWithSRP {
	public static void main(String[] args) {
		System.out.println("Welcome to the Application!");
		// get a pair of values
		PairOfInput pair = PairOfInputProcessor.read();
		// check whether the inputs are valid
		if (PairOfInputProcessor.isValid(pair)) {

			int firstInt, secondInt;
			firstInt = Integer.parseInt(pair.getFirst());
			secondInt = Integer.parseInt(pair.getSecond());

			// Create instances of operations
			MathOperation addOperation = new AddOperation();
			MathOperation subtractOperation = new SubtractOperation();

			// do the mathematical operation
			int addResult = addOperation.operate(firstInt, secondInt);
			System.out.println("Addition result is: " + addResult);
			int subtractResult = subtractOperation.operate(firstInt, secondInt);
			System.out.println("Subtraction result is: " + subtractResult);
			System.out.println("The result is: " + subtractResult);
		} else {
			System.out.println("Invalid number");
		}

		System.out.println("End of the application!");
	}

}
