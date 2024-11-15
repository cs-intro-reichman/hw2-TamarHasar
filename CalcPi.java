// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int numOfTerms = Integer.parseInt(args[0]);
	    double sum = 1.0;
		double diviser = 3.0;
		boolean sign = false; //use false for minus - and true for +
		
		for (int i = 1; i < numOfTerms; i++) {
            if (sign) {
                sum = sum + (1.0 / diviser);  
            } else {
                sum = sum - (1.0 / diviser);  
            }
            
            diviser += 2.0; 
            sign = !sign;
		}

		sum = sum * 4; 

		System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + sum);
	}
}

