class Test47_dowhile{
	public static void main(String[] args){
		System.out.println("Loop start");

     int i=1;
     do{
      System.out.println("Hi"+i);
      i++;
    }while(i<=3);//-->here two condition are mandatory,decl must be out of the loop
                 //--->and ; is mandatory,exe of statement is min. 1 & max n
      System.out.println("Hello"+i); 
      System.out.println("Loop end"); 
/*
     do{
        int j=1;
        System.out.println(j);//->CE:cannot find symbol,j variable must 
        j++;                  //be declare before loop(when u use that var in while) 
    }while(j<=5);
*/
	}
}
