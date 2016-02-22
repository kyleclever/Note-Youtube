package basic;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};
		System.out.println(a[2]+" "+a[4]);  //index start with 0
		
		//enhanced for
		for(int temp: a){
			System.out.println(temp);
		}
		
		String[] x = new String [5];   // Create a new empty array x that have 5 elements
		
		x[3] = "25";
		x[0] = "10";
		for (String temp2: x){
			System.out.println(temp2);
		}
		

	}

}
