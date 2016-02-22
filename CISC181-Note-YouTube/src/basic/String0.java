package basic;

public class String0 {  //file name should be differenable 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Kyle Wang";	
		
	
		System.out.println("Hello " + x);
		System.out.println(x.toUpperCase());
		System.out.println(x.substring(2));
		System.out.println(x.substring(2,7));  //from 2 to 6!!! no end point
		System.out.println(x.charAt(3));
	
		// convert string to int
		String age = "11";
		String salary = "78945.63";
				//Wrapper classes
			int a = Integer.parseInt(age)/2;
			System.out.println(a);
			
			double s = Double.parseDouble(salary)* .15;
			System.out.println(s);
		
	   //System.out.printf("%3.1f", 1234.56)
	}

}
