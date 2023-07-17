
public class concessionFare extends fareTypeClasses{

	double weekDayCon=4.40,weekEndCon=3.20,weekCon=22.00,weekDailyCon=2.65;
	 public double moveMoney(int a,int b,int c){
		 fullFare obj = new fullFare();
		 return(obj.totalFareMoveMoney(a, b, c, weekDayCon,weekEndCon));
	 }
	 public double movePass(int a){
		 fullFare obj1 = new fullFare();
		 return(obj1.totalFareMovePass(a, weekDailyCon));
	 }
}
