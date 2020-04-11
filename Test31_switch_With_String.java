class Test31_switch_With_String{
	   static void dayNum(String dayName){
         switch(dayName){
            case "MON":
		     System.out.println("Monday is day 1 ");
			 break;

            case "TUE":
              System.out.println("Tuesday is day 2");
              break;

            case "WED":
              System.out.println("Wednesday is day 3");
              break;

            case "THU":
              System.out.println("Thursday is day 4");
              break;
            
			case "FRI":
              System.out.println("Friday is day 5");
              break;

			case "SAT":
              System.out.println("Saturday is day 6");
              break;

			case "SUN":
              System.out.println("Sunday is day 7");
              break;

            default :
				System.out.println("Invalid day name");
		 }//-->switch close
	   }//-->method close

	   public static void main(String[] args){
		   dayNum("SUN");
	}//-->main close
}//-->class close
