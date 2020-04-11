import java.util.*;
class Test45_while{
	public static void main(String[] args){

     System.out.println("Loop start");
		int i=1;
/*        while(i<=10){
           System.out.println("Hi"+i);//-->if we do not place incr statement then it
                                      //-->it leads to infinite loop           
        }
*/
        int j=1;
        while(j<=3){
           System.out.println("Hi"+j);
           j++;
        }
        System.out.println("Hello"+j);//-->j scope allowed to access
        System.out.println("Loop end");
        System.out.println();

      List list=Arrays.asList(10,20,30,40,50);
        
         int index=0;
       while(index<list.size()){
          System.out.println(index);//-->here index will be display
          index++;
       }
       System.out.println();

       index=0;
       while(index<list.size()){
        System.out.println(list.get(index));//here array list value will be display
        index++;
       }
       System.out.println();

       Iterator itr=list.iterator();
        while(itr.hasNext()){         //->another way to display array list value
           System.out.println(itr.next());
        }
        System.out.println();
//now apply for loop on above example

       for(int k=1;k<=10;k++){
          System.out.println(k);
      }
      System.out.println();

      for(int l=0;l<list.size();l++){
            System.out.println(list.get(l));
      }
      System.out.println();

      for(Iterator itr2=list.iterator();itr2.hasNext(); ){
           System.out.println(itr2.next());
       }
       System.out.println();
	}
}
