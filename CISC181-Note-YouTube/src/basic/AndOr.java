package basic;

public class AndOr {

	public static void main(String[] args) {
		// &&- and           ||- or
		
		int x, y;
		x=10;
		y=-10;
		
		if(x>0 && y>0){   // if only one &, check both
			System.out.println("Both numbers are positive");
		} else if (x >0 || y>0){
			System.out.println("atleast one num is positive");
		} else{
			System.out.println("Both are negative");
		}

	}

}
