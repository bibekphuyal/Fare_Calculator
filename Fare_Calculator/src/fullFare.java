
public class fullFare extends fareTypeClasses{
	
	 double weekDayFull=8.80, weekEndFull=6.40, weekFullWeekly=44.00, weekDayFullDaily=5.30;
	 public double moveMoney(int a,int b,int c){
		 fullFare obj = new fullFare();
		 return(obj.totalFareMoveMoney(a, b, c, weekDayFull,weekEndFull));
	 }
	 public double movePass(int a){
		 fullFare obj1 = new fullFare();
		 return(obj1.totalFareMovePass(a, weekDayFullDaily));
	 }
}
