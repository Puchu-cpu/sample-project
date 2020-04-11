class Test50_dowhile{
	public static void main(String[] args){
		
          int i=1;
          do{
           System.out.println(i);//o/p=>1 2 3 4 5
           i++;
         }while(i<=5);
         System.out.println("-----------------------\n");
       
          i=1;
          do{
           i++;
           System.out.println(i);//o/p=>2 3 4 5 6
           }while(i<=5);
           System.out.println("-----------------------\n");

            i=1;
            do{
            i++;
            System.out.println(i);//o/p=>2 4 6
            i++;
            }while(i<=5);
           System.out.println("-----------------------\n");

           i=1;
           do{
           System.out.println(i);//o/p=>1 3 5
            i+=2;
           }while(i<=5);
           System.out.println("-----------------------\n");

            i=1;
          do{
           i+=2;
           System.out.println(i);//o/p=>3 5 7
           }while(i<=5);
           System.out.println("-----------------------\n");

            i=1;
          do{
           System.out.println(i);//o/p=>1 4
           i+=3;
           }while(i<=5);
           System.out.println("-----------------------\n");

            i=1;
          do{
//          System.out.println(i);//o/p=>1 0 -1 -2 -3 -4 -5 -6 -7.......false
            i--;
           }while(i<=5);
           System.out.println("-----------------------\n");

           i=1;
          do{
//            System.out.println(i);//o/p=>1 1 1 1 1...........infinite
           }while(i<=5);
           System.out.println("-----------------------\n");
          
           
          byte b=1;
          do{
            System.out.println(b);//o/p=>1 0 -1 -2 -3 -4 -5 -6 -7.......false
            b--;
           }while(b<=5);
           System.out.println("-----------------------\n");

           
	}
}
