import java.util.Scanner;
enum Tiffin{
  IDLY,DOSA,PURI
}
class Test44_switch_enum3{
	   static void displayPrice(Tiffin food){

        switch(food){
             case IDLY:
             System.out.println(food+" price is Rs.20/-");
             break;
             
            case DOSA:
             System.out.println(food+" price is Rs.30/-");
             break;

            case PURI:
             System.out.println(food+" price is Rs.40/-");
             break;
     }//->switch close

}//->method close

     public static void main(String[] args){
          Scanner scn= new Scanner(System.in);
         System.out.println("Menu");

         System.out.println("1.IDLY");
         System.out.println("2.DOSA");
         System.out.println("3.PURI");

         System.out.println("What do you want:");
         System.out.print("Enter a number:");
          int num=scn.nextInt();
       switch(num){
            case 1:
              displayPrice(Tiffin.IDLY);
              break;
 
             case 2:
              displayPrice(Tiffin.DOSA);
              break;

              case 3:
              displayPrice(Tiffin.PURI);
              break;

            default:
               System.out.println("Invalid Option.");
        }

    }//-->main close
}//-->close class
 
 
		
	
