import java.util.Scanner;
class Test08_LargestNumber{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter first number:");
		double Fno=scn.nextDouble();
		System.out.print("Enter second number:");
		double Sno=scn.nextDouble();
		System.out.print("Enter third number:");
		double Tno=scn.nextDouble();
		
		
		if((Fno>=Sno)&&(Fno>=Tno))
		   System.out.println(Fno+" is the largest number");
        else if((Sno>=Fno)&&(Sno>=Tno))
		   System.out.println(  Sno+ " is the largest number");
        else
           System.out.println(Tno +" is the largest number");
	}
}
