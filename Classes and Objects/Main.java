
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicycle myBike = new Bicycle(30, 0, 8);
		

	}
	
	public double calculateAnswer(double wingSpan, int numberOfEngines, double length, double grossTons) {
		
		// do the calculation here
		
		return 0.0;
		
	}
	
	public double computePayment(double loanAmt,
			double rate, double futureValue, int numPeriods) {
		
		double interest = rate / 100.0;
		double partiall = Math.pow((1+interest), -numPeriods);
		double denominator = (1 - partiall) / interest;
		double answer = (-loanAmt / denominator) - ((futureValue * partiall) / denominator);
		return answer;
	}
	
	public Polygon polygonFrom(Point[] corners) {
		// meyhod body goes here 
		
		return null;
	}
	
	public Polygon polygonFrom(String... corners) {
		// meyhod body goes here 
		
		return null;
	}


}

class Polygon {}

class Point {
	int x, y;
}
