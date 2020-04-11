class Test17_else_expr{
	public static void main(String[] args){
		m1(15);
	}		
		
	static void m1(int a){	
		if(a<10){
		System.out.println("Hi");
		}else{                              //o/p==>Hi
		System.out.println("Hello");              //HRU?(if condition is true)
		}
		System.out.println("HRU?");	        //o/p==>Hello
		System.out.println();               //      HRU?(if condition is false)
	}
}
