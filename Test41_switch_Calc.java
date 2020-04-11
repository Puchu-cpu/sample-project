import java.util.Scanner;
class Test41_switch_Calc{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
         System.out.print("Enter two number:");
           double Fno=scn.nextDouble(); 
           double Sno=scn.nextDouble(); 

        System.out.print("Choose one operator(+,-,*,/):");
           char opr=scn.next().charAt(0);
  
           double result=0;
             
            switch(opr){
               case '+':
                   result=Fno+Sno;
                   break;
               case '-':
                   result=Fno-Sno;
                   break;
               case '*':
                   result=Fno*Sno;
                   break;
               case '/':
                   result=Fno/Sno;
                   break;
               default:
                   System.out.println("Enter valid symbol");
           }
       System.out.println("The result is:"+result);
                  
       
	}
}
