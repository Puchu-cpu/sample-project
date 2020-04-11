class Test09_if{
	public static void main(String[] args){
		
//        if(10){}//-->int cant be converted to boolean
//        if('a'){}//-->char cant be converted to boolean 
//        if(6.7){}//-->double cant be converted to boolean
//        if("a"){}//-->String cant be converted to boolean
		  
//		  if(0){}//-->0 is not a boolean value in java
//		  if(1){}//-->0 is not a boolean value in java

          if(true){}
          if(false){}

		  boolean bo1=true;
		  boolean bo2=false;
		  if(bo1){}
		  if(bo2){}

		 if(bo1&&bo2){}
		 if(bo1||bo2){}

		 if(bo1&bo2){}
		 if(bo1|bo2){}

		 int a=10;

		 if(a<5){}
		 if(a>5){}

		 if(a==5){}
		 if(a!=5){}

		 if(m1()){}

//		 if(a=10){}//--->int cant be converted to boolean
         if(a==10){}

		 if(bo1=true){}
		 if(bo1==true){}

	}
	static boolean m1(){
		return true;
	}
}
