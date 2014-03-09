import java.lang.Math;
import java.util.Scanner;

public class TestFunctions {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		double x = input.nextDouble();
		
		Functions func1 = new FunctionA(x);
		Functions func2 = new FunctionB(x);
		Functions func3 = new FunctionC(x);
		Functions func4 = new FunctionD(x);
		Functions func5 = new FunctionE(x);
		Functions func6 = new FunctionF(x);
		Functions func7 = new FunctionG(x);
		
		System.out.println(func1.toString());
		System.out.println(func2.toString());
		System.out.println(func3.toString());
		System.out.println(func4.toString());
		System.out.println(func5.toString());
		System.out.println(func6.toString());
		System.out.println(func7.toString());
		
	}

}

class Functions {

	protected double x;
	
	protected Functions() {
	}
	
	protected Functions(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "f(x) = " + getX();
	}
	
}

// FunctionA
class FunctionA extends Functions {

	public FunctionA() {
	}
	
	public FunctionA(double x) {
		this.x = x;
	}
	
	public double getFunctionA() {
		return Math.pow(x,2);
	}
	
	public void setFunctionA(double x) {
		this.x = x;
	}
	
	public String toString() {
		return "a. f(x) = " + getFunctionA();
	}
	
}

// FunctionB
class FunctionB extends Functions {

	public FunctionB() {
	}
	
	public FunctionB(double x) {
		this.x = x;
	}
	
	public double getFunctionB() {
		return Math.sin(x);
	}
	
	public void setFunctionB(double x) {
		this.x = x;
	}
	
	public String toString() {
		return "b. f(x) = " + getFunctionB();
	}
	
}

// FunctionC
class FunctionC extends Functions {

	public FunctionC() {
	}
	
	public FunctionC(double x) {
		this.x = x;
	}
	
	public double getFunctionC() {
		return Math.cos(x);
	}
	
	public void setFunctionC(double x) {
		this.x = x;
	}
	
	public String toString() {
		return "c. f(x) = " + getFunctionC();
	}
	
}

// FunctionD
class FunctionD extends Functions {

	public FunctionD() {
	}
	
	public FunctionD(double x) {
		this.x = x;
	}
	
	public double getFunctionD() {
		return Math.tan(x);
	}
	
	public void setFunctionD(double x) {
		this.x = x;
	}
	
	public String toString() {
		return "d. f(x) = " + getFunctionD();
	}
	
}

// FunctionE
class FunctionE extends Functions {

	public FunctionE() {
	}
	
	public FunctionE(double x) {
		this.x = x;
	}
	
	public double getFunctionE() {
		return Math.cos(x) + 5 * Math.sin(x);
	}
	
	public void setFunctionE(double x) {
		this.x = x;
	}
	
	public String toString() {
		return "e. f(x) = " + getFunctionE();
	}
	
}

// FunctionF
class FunctionF extends Functions {

	public FunctionF() {
	}
	
	public FunctionF(double x) {
		this.x = x;
	}
	
	public double getFunctionF() {
		return 5 * Math.cos(x) + Math.sin(x);
	}
	
	public void setFunctionF(double x) {
		this.x = x;
	}
	
	public String toString() {
		return "f. f(x) = " + getFunctionF();
	}
	
}

// FunctionG
class FunctionG extends Functions {

	public FunctionG() {
	}
	
	public FunctionG(double x) {
		this.x = x;
	}
	
	public double getFunctionG() {
		return Math.log(x) + Math.pow(x,2);
	}
	
	public void setFunctionG(double x) {
		this.x = x;
	}
	
	public String toString() {
		return "g. f(x) = " + getFunctionG();
	}
	
}
