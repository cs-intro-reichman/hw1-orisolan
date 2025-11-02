public class FVCalc {
	public static void main(String[] args){
	double current = Double.parseDouble(args[0]);
	double interest = Double.parseDouble(args[1]);	
    double n = Double.parseDouble(args[2]); 
	double res = current*(Math.pow((1+interest/100.0), n));
	System.out.println("After " + ((int) n) + " years, $" +  ((int)current) + " saved at " + interest + "% will yield $" + ((int) res));
	}
}