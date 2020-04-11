//Rule #6:
//We can not place case or default directly in the method
//compiler will throw error

//We must place them only inside switch(-)block

class Test27_switch_Rule6{
	public static void main(String[] args){
		
		case 5:
		System.out.println("Hi");//CE:Orphaned case

		default:
			System.out.println("Hello");//CE:Orphaned case
	}
}
