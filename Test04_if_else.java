import java.util.Scanner;
class Test04_if_else{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);

		System.out.print("Enter a number:");
		int num=scn.nextInt();
		
		if(num%2==0)
			System.out.println("Number is even.");
		else
		   System.out.println("Number is odd");
	}
}
