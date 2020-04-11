class Test18_else_Vd{
	public static void main(String[] args){
		
//		if(true){
//			int a=10;
//		  System.out.println(a);
//		}else{
  //        System.out.println(a);//CE:cant find symbol a
  //      }
//		System.out.println(a);//-->scope of var a is within the if block
	
//Without if(-),only else not allowed	
//	else{
  //        System.out.println(a);//CE:else without if
  //      }

/*
		if(true){
			System.out.println("HI");
		}else{
            System.out.println("Hello");
		}else{                             //after if multiple else not allowed
			System.out.println("HRU?");
		}*/

		if(true){
		System.out.println("Hi");
		System.out.println("HRU?");
		}
	//	System.out.println("Just for fun");	
		else{                              //CE: else without if
		System.out.println("Hello");
		System.out.println("HRU?");
		}
		System.out.println("WRU?");

		if(true){
			int p=10;
        }else{
            int q=20;
			}
 //		System.out.println(p);//CE:cant find symbol	
 //		System.out.println(q);	
	
	}
}
