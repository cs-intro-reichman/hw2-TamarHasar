// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int numOfTerms = Integer.parseInt(args[0]);
	    double sum = 1;
		double diviser = 3.0;
		boolean sign = true; //use false for minus - and true for +
		
		if (numOfTerms >= 1){
			sum = sum - ((float)1 / diviser);
		}

		for(int i = 2; i < numOfTerms; i ++) {
			diviser += 2.0;

			if (sign) {
				sum = sum + ((float)1.0 / diviser);
				sign = false;
			}

			else {
				sum = sum - ((float)1.0 / diviser);
				sign = true; 
			}
		}

		sum = sum * 4; 

		System.out.println("Pi according to Java: " + Math.PI);
		System.out.println("Pi,  approximated: " + sum);
	}
}
