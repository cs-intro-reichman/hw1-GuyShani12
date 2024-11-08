// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// The current amount of money invested
		int currentValue = Integer.parseInt(args[0]);
		// Precentage of interest
		double rate = Double.parseDouble(args[1]);
		// Number of years
		int n = Integer.parseInt(args[2]);
		// Calculate the future value
		double futureValue = Math.pow((1 + rate/100), n) * currentValue;

		System.out.println("After " + n +" years, a $" + currentValue + " saved at " + rate +
		 "% will yield $" + (int) futureValue);
	}
}
