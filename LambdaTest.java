package Lambda;

import java.util.ArrayList;

public class LambdaTest {
	
	 public static void main(String[] args) {
		    ArrayList<Integer> kitNumbers = new ArrayList<Integer>();
		    kitNumbers.add(9);
		    kitNumbers.add(10);
		    kitNumbers.add(7);
		    kitNumbers.add(11);
		    kitNumbers.forEach( (n) -> { System.out.println(n); } );
		  }
		}
