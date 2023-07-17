import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int check;
		 System.out.println("Enter '1' for Full fare and '2' for concession: ");
		 Scanner a = new Scanner(System.in); 
		 check = a.nextInt(); 	 
		 switch(check){    
		      case 1:
		    	  int weekday=0,weekend=0,totalWeek;
		    	  boolean test,test1;
			   do {
				   System.out.println("Enter Number of Days to travel in weekdays ");
				   Scanner s = new Scanner(System.in);
				   weekday = s.nextInt();
				   if (weekday < 6) {
					   test = false;
				   }else{
					   System.out.println("Weekdays should be in range of 0 - 5 days");
					   test = true;
				  }
			   } while ((test));
			   do{
		         	 System.out.println("Enter Number of Days to travel in weekends ");
		 			  Scanner t = new Scanner(System.in); 
					  weekend = t.nextInt();
					  if(weekend<3){
						  test1 = false;
					  }else{
						  System.out.println("Weekends should be in range of 0 - 2 days");
						  test1 = true;
					  }
			   }while((test1));	  
					 System.out.println("Enter Number of weeks ");
					 Scanner r = new Scanner(System.in); 
					 totalWeek = r.nextInt();
                    fullFare obj = new fullFare();
                    double totalMoney= obj.moveMoney(weekday,weekend,totalWeek);
                    System.out.println("The amount in 'Move Money': "+totalMoney);
                    double totalPass = obj.movePass(totalWeek);
                    System.out.println("The amount in 'Move Pass': "+totalPass);
                    if(totalMoney>totalPass){
  		    		  System.out.println("Recommendation: 'Move Pass'");
  		    	  }else{
  		    		  System.out.println("Recommendation: 'Move money'");
  		    	  }
                    break;
                    
		      case 2:
		    	  int weekdayc=0,weekendc=0,totalWeekc;
		    	  boolean testc,testc1;
			   do {
				   System.out.println("Enter Number of Days to travel in weekdays ");
				   Scanner m = new Scanner(System.in);
				   weekdayc = m.nextInt();
				   if (weekdayc < 6) {
					   testc = false;
				   }else{
					   System.out.println("Weekdays should be in range of 0 - 5 days");
					   testc = true;
				  }
			   } while ((testc));
			   do{
		         	 System.out.println("Enter Number of Days to travel in weekends ");
		 			  Scanner n = new Scanner(System.in); 
					  weekendc = n.nextInt();
					  if(weekendc<3){
						  testc1 = false;
					  }else{
						  System.out.println("Weekends should be in range of 0 - 2 days");
						  testc1 = true;
					  }
			   }while((testc1));	  
					 System.out.println("Enter Number of weeks ");
					 Scanner m = new Scanner(System.in); 
					 totalWeekc = m.nextInt();
                   concessionFare obj1 = new concessionFare();
                    double totalMoneyc= obj1.moveMoney(weekdayc,weekendc,totalWeekc);
                    System.out.println("The amount in 'Move Money': "+totalMoneyc);
                    double totalPassc = obj1.movePass(totalWeekc);
                    System.out.println("The amount in 'Move Pass': "+totalPassc);
                    if(totalMoneyc>totalPassc){
  		    		  System.out.println("Recommendation: 'Move Pass'");
  		    	  }else{
  		    		  System.out.println("Recommendation: 'Move Money'");
  		    	  }
		 		break;
		 		  
					
	}
}
}
