
public class TestFunctions {

	public static void main(String[] args) {

	}

}

abstract class Functions {

	protected int x;
	
	protected Functions() {
	}
	
	protected Functions(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "f(x) = " + x;
	}
	
	public abstract double getFunctionA();
	public abstract double getFunctionB();
	public abstract double getFunctionC();
	public abstract double getFunctionD();
	public abstract double getFunctionE();
	public abstract double getFunctionF();
	public abstract double getFunctionG();
	
}
