enum Day{
	MON,TUE,WED,THU,FRI,SAT,SUN
}
class Test32_switch_With_enum{
	   static void displayDayNum(Day day){
      switch(day){
		  case MON:
		    System.out.println(day+"is day 1 in the week");
            break;
          
		  case TUE:
		    System.out.println(day+"is day 2 in the week");
            break;

          case WED:
		    System.out.println(day+"is day 3 in the week");
            break;

          case THU:
		    System.out.println(day+"is day 4 in the week");
            break;

          case FRI:
		    System.out.println(day+"is day 5 in the week");
            break;

          case SAT:
		    System.out.println(day+"is day 6 in the week");
            break;
          
		  case SUN:
		    System.out.println(day+"is day 7 in the week");
            break;

	  }//-->switch close
	   }//-->method close

	   public static void main(String[] args){
		   displayDauNum(Day.SUN);
	}//-->main close
}//-->class close
