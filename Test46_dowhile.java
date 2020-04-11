import java.util.Scanner;
class Test46_dowhile{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
        String option;
        
        do{
        System.out.print("Enter num:");
        int num=scn.nextInt();scn.nextLine();

        System.out.println("you entered:"+num);

       System.out.print("\nDo you want to continue?:");
       option=scn.nextLine();
    }while(option.equalsIgnoreCase("Y"));
        
	}
}
