class Test13_if{
	public static void main(String[] args){
		
		
		int a;
		if(true){
           a=10;
		}   
		System.out.println(a);//--->20,scope if variable is not end
        
/*		int b;
		if(false){
           b=10;
		}   
		System.out.println(b);//variable b might not have initialized,because of if
		                       //block is false,initialization not happen
*/
/*      int p=10;
		int c;
		if(p==10){    //here copmiler assume p as datatype and 
		                p value can be change,means condition can be 
			c=30;     //False or true so it throw error 
			System.out.println(c);//(p==10)==>(boolean)==>(true/false)==>true 30
		}                                                        or false c!vd->CE
		System.out.println(c);*/

/*      int q=20;
		int d;
		if(q==10){    //here copmiler assume q as datatype 
		              // and q value can be change,means condition can be 
			d=30;     //False or true so it throw error 
		System.out.println(d);
		}
		System.out.println(d);*/

		final int r=10;
		int e;
		if(r==10){    //here r variable is declare as final,so value cant be change 
			e=30;     //and the if block will execute
		System.out.println(e);//-->30
		}
		System.out.println(e);//-->30

/*		final int s=20;
		int f;
		if(s==10){    //here cmpiler throw because if block is false,so could not 
			f=30;     //initialize f variable,compiler throw error var may have not
		System.out.println(f);//-->been initialize
		}
		System.out.println(f);//-->*/

/*		final int t;
		t=10;          //final work only on single line,here var is final but not
		int g;           value,so value can be change,so compiler will throw error
		if(t==10){
			g=30;
          System.out.println(g);
		}
		System.out.println(g);*/

		final int u;
		u=20;
		int h=-1;
		if(u==10){     //here if block will not execute
			h=50;
	       System.out.println(h);
        }
		System.out.println(h);//-->default assign value -1

/*
     When we declare a local variable outside if block and initialized in if block 
	 and accessing after if block,we will get CE:v m n h b i,because compiler
	 will not consider the initialization done in if block,because it may or
	 may not be executed*/
	}
}
