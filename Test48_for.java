class Test48_for{
	public static void main(String[] args){
		System.out.println("Loop start");
           for(int i=1;i<=3;i++){
             System.out.println("Hi"+i);
            }
 //System.out.println("Hello"+i);->outside loop the scope of var i end,cant access i
       System.out.println();

     int i=1;
     for(;i<=3;i++){
         System.out.println("Hi"+i);
    }
    System.out.println("Hello"+i);//here i var is outside the loop,so we can access

      System.out.println("Loop end");
	}
}
