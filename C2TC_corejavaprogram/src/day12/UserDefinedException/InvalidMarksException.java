package day12.UserDefinedException;

public class InvalidMarksException extends Exception{

	public InvalidMarksException() {
		super();
	}

	public InvalidMarksException(String message) {
		super(message);
	}


}
