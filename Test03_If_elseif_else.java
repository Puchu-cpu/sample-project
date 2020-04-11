import java.util.Scanner;
class Test03_If_elseif_else{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int num=scn.nextInt();

		if(num<0)
          num+=5;
		else if(num>0)
			num+=10;
		else
			num+=15;
		System.out.println("Number is:"+num);
	}
}
