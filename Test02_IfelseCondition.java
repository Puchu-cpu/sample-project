import java.util.Scanner;
class Test02_IfelseCondition{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=scn.nextInt();
		
		if(num>0)
			num=num+10;//if there is one one statement then no need of {}
		               //but the statement must not be variable declaration
		else
			num=num+5;
		System.out.println("Result:"+num);

	}
}