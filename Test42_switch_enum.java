enum FoodItem{
   IDLY,DOSA,PURI
}
class Test42_switch_enum{
	static void displayFoodPrice(FoodItem tiffin){
        switch(tiffin){
         case IDLY:
     		System.out.println(tiffin+" is Rs.30/-");
            break;
         case DOSA:
     		System.out.println(tiffin+" is Rs.40/-");
            break;
         case PURI:
     		System.out.println(tiffin+" is Rs.45/-");
            break;
     }
}
  public static void main(String[]args){
          displayFoodPrice(FoodItem.PURI);

         
	}
}
