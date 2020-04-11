//develop a program to dispaly number 1-10 by using while loop
  //var decl and initia      --->i=1
  //var based condition      --->i<=10
  //var incr                 --->i=i+1 or i++

class Test49_while{
	public static void main(String[] args){
		System.out.println("Loop start");

       int i=1;
       while(i<=10){
           System.out.println("Hi"+i);
           i++;
       }
       System.out.println("Hello"+i);
       System.out.println("Loop end");
       System.out.println();
      
 /*      int i=1;
        while(i<=10){
             System.out.println("Hi"+i);//->infinite loop,o/p->1 1 1 1......
        }
*/
        i=1;
        while(i<=5){
           System.out.println(i); //o/p-->1,2,3,4,5
           i++;
        }
        System.out.println("----------------------------");

        i=1;
        while(i<=5){
           i++;
           System.out.println(i); //o/p-->2,3,4,5,6
        }
        System.out.println("----------------------------");
        
        i=1;
        while(i<=5){
           i++;
           System.out.println(i); //o/p-->2,4,6
           i++;
        }
        System.out.println("----------------------------");

        i=1;
        while(i<=5){
           System.out.println(i); //o/p-->1 3 5
           i+=2;
        }
        System.out.println("----------------------------\n");

       i=1;
        while(i<=5){
           i+=2;
           System.out.println(i); //o/p-->3 5 7
        }
        System.out.println("----------------------------\n");

        i=1;
        while(i<=5){
        System.out.println(i); //o/p-->1 4
        i+=3;
        }
        System.out.println("----------------------------\n");

        i=1;
        while(i<=5){
//      System.out.println(i); //o/p-->1 0 -1 -2 -3 -4 -5 -6 -7..........false
        i--;
        }
        System.out.println("----------------------------\n");

        byte b=1;
        while(b<=5){
//      System.out.println(b); //o/p-->1 0 -1 -2 -3..........-128
        b--;
        }
//      System.out.println("b:"+b);
        System.out.println("----------------------------\n");
        
        b=1;
        while(b<=5){
        b++;
        System.out.println(b); //o/p-->2 2 2 2 2 2 2 2.........infinite time
        b--;
        }
        System.out.println("b:"+b);
        System.out.println("----------------------------\n");
        


	}
}
