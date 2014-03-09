import java.lang.Math;
import java.util.Scanner;

public class TestFunctions {

	/**Main method*/
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		double x = input.nextDouble();
		
		FunctionA func1 = new FunctionA();
		FunctionB func2 = new FunctionB();
		FunctionC func3 = new FunctionC();
		FunctionD func4 = new FunctionD();
		FunctionE func5 = new FunctionE();
		FunctionF func6 = new FunctionF();
		FunctionG func7 = new FunctionG();
		
		System.out.println("a. f(x) = " + func1.f(x));
		System.out.println("b. f(x) = " + func2.f(x));
		System.out.println("c. f(x) = " + func3.f(x));
		System.out.println("d. f(x) = " + func4.f(x));
		System.out.println("e. f(x) = " + func5.f(x));
		System.out.println("f. f(x) = " + func6.f(x));
		System.out.println("g. f(x) = " + func7.f(x));
		
	}

}

// Functions Class (parent class)
abstract class Functions {

	abstract double f(double x);
	
}

// FunctionA Class (subclass1)
class FunctionA extends Functions {

	public double f(double x) {
		return Math.pow(x,2);
	}
	
}

// FunctionB Class (subclass2)
class FunctionB extends Functions {

	public double f(double x) {
		return Math.sin(x);
	}

}

// FunctionC Class (subclass3)
class FunctionC extends Functions {

	public double f(double x) {
		return Math.cos(x);
	}
	
}

// FunctionD Class (subclass4)
class FunctionD extends Functions {

	public double f(double x) {
		return Math.tan(x);
	}

}

// FunctionE Class (subclass5)
class FunctionE extends Functions {

	public double f(double x) {
		return Math.cos(x) + 5 * Math.sin(x);
	}

}

// FunctionF Class (subclass6)
class FunctionF extends Functions {

	public double f(double x) {
		return 5 * Math.cos(x) + Math.sin(x);
	}

}

// FunctionG Class (subclass7)
class FunctionG extends Functions {

	public double f(double x) {
		return Math.log(x) + Math.pow(x,2);
	}
	
}
