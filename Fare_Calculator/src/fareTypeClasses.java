
abstract class fareTypeClasses implements calculator{
	
	
	public double totalFareMoveMoney(int a, int b, int c, double d, double e) {
		return (((a*d)+(b*e))*c);
	}
	public double totalFareMovePass(int a, double b) {
		return (a*7*b);
	}

	
	
	
}
