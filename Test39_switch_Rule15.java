//Rule #15:
//Executing same logic for multiple cases
class Test39_switch_Rule15{
	  static void m1(int a){
         switch(a){
            case 1:
            case 2:
            case 3:
		        System.out.println("Hi");
                break;
            case 4:
                System.out.println("Hello");
                break;
            default:
                System.out.println("HRU?");
          }
}
       public static void main(String[]args){
          Test39_switch_Rule15.m1(8);

	}
}
