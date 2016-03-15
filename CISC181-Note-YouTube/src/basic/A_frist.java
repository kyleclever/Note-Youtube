package basic;

public class A_frist {
	/*   Comments block
	 *  I'm new to Java
	 */
//static variable - shared variable, updated every time
//static method with static variable, don't have to create new object
//tuna.getMembers() >>>3
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		int x = 10;
		int y = 20;
		int result = x+y;
		System.out.println("result ="+ result); // Concatenate, not addition
		
		
		
		
		int a = 20;
		int b = 20;
		if (a<b){
			System.out.println("x is less than Y");
		}
		else if (a == b){  // save time, skip if satisfied the last one
			System.out.println("equal");
		}
		else // no condition
			{
			System.out.println("greater");		
			
			
		}
			
	}
		
}
	

