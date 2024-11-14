// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String chant = args[0];
            int numTimes = Integer.parseInt(args[1]);
            String chantUpperCase = chant.toUpperCase();
            String useAn = "AEFHILMNORSX";

            for (int i = 0; i < chant.length(); i ++ ) {
                if (useAn.indexOf(chantUpperCase.charAt(i)) != -1){
                        System.out.println("Give me an "+ chantUpperCase.charAt(i) +
                                                ": " + chantUpperCase.charAt(i) + "!");
                }

                else {
                        System.out.println("Give me a "+ chantUpperCase.charAt(i) +
                                                ": " + chantUpperCase.charAt(i) + "!");
                }
            }
            System.out.println("What does that spell?");
            
            for (int i = 0; i < numTimes; i ++ ){
                System.out.println(chantUpperCase + "!!!");
            }
        }
}
