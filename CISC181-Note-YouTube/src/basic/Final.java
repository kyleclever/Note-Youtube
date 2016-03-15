package basic;

public class Final {
	private int sum;
	private final int NUMBER; //CAN'T MODIFIED NEVER CHANGE
	
	//Constructor
	public Final(int x){
		NUMBER = x;
		}
	public void add(){
		sum += NUMBER;
	}
	public String toSting(){
		return String.format("sum = %d\n", sum);
	}
}
