class Test51_for{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
        System.out.println(i);//1 2 3 4 5
     }
       System.out.println("-------------\n");

        for(int i=1;i<=5;){
        System.out.println(i);//-->1 2 3 4 5
        i++;
    }
      System.out.println("-------------\n");

         for(int i=1;i<=5;i++){
        System.out.println(i);//-->1 3 5
        i++;
    }
     System.out.println("-------------\n");

        for(int i=1;i<=5;){
        i++;
        System.out.println(i);//2 3 4 5 6
       
    }
     System.out.println("-------------\n");

       for(int i=1;i<=5;i+=2){
        System.out.println(i);//-->1 3 5
    }
     System.out.println("-------------\n");

       for(int i=1;i<=5;){
        i+=2;
        System.out.println(i);//3 5 7
    }
     System.out.println("-------------\n");

	}
}
