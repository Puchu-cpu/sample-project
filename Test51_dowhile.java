class Test51_dowhile{
	public static void main(String[] args){
		
     byte b=1;
     do{
       System.out.println(b);//-->1 0 -1 -2 -3 -4 -5 -6......-128
       b--;
    }while(b<=5);
       System.out.println("b:"+b);//b:127
     
     b=1;
     do{
       b++;
       System.out.println(b);//-->2 2 2 2 2 2 2 2.......infinite
       b--;
    }while(b<=5);
       System.out.println("b:"+b);//b:127
	}
}
