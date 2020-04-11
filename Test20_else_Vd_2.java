class Test20_else_Vd_2{
	public static void main(String[] args){
		
		int a;
		int b;
		if(false){
			a=10;
		    System.out.println("In if");
		    System.out.println(a);
		    System.out.println(b);
		}else{
            b=20;
		    System.out.println("In else");
//		    System.out.println(a);
            System.out.println(b);
		}
        System.out.println("After if..else");
   //     System.out.println(a);
        System.out.println(b);
	}
}
