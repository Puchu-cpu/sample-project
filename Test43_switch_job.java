import java.util.Scanner;
class Test43_switch_job{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
        
          System.out.print("Enter Designation:");
           String desig=scn.nextLine();

        switch(desig){
           case "FR":
             System.out.println(desig+" have <1 year of experience");
             break;  
           case "SR":
             System.out.println(desig+" have <2 year of experience");
             break;
           case "SSR":
             System.out.println(desig+" have <3 year of experience");
             break; 
           case "TTL":
             System.out.println(desig+" have <4 year of experience");
             break; 
           default:
              System.out.println("Invalid Designation");
}   
	}
}
