class Test20_else_Vd_1{
	public static void main(String[] args){
		
		int a=10;
		int b=20;
		if(false){
		    System.out.println("In if");
		    System.out.println(a);
		    System.out.println(b);
		}else{
		    System.out.println("In else");
		    System.out.println(a);
            System.out.println(b);
		}
        System.out.println("After if..else");
        System.out.println(a);
        System.out.println(b);
	}
}
