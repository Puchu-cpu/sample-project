//Rule #14:
//1)as a case label we use either binary/octal/decimal/hexadecimal

//2)if we use binary/octal/hexadecimal,they are converted to decimal

//3)If the one case decimal value is equals to other case value 
//    either by binary/octal/hexadecimal
//      compiler will throw error duplicate case label

//4)we can not place multiple default labels

//5)we can place one default and any where in switch {}
//  either at beginning/in middle of cases/at end 
//  as per project recommended place is at end of switch
 
class Test37_switch_Rule14{
	public static void main(String[] args){
	  switch(5){

      case 0B011:          //=>case 3:

      case 01:             //=>case 1:

      case 7:              //=>case 7:

      case 0xA1:	       //=>case 161:
   }

      switch(5){
  
 //       case 0B012:       //=>2 is not in the range of binary

//        case 018:         //=>8 is not in the range of octal

          case 7:

//        case 0xADG:       //G is not in the range of hexadecimal

   }

      switch(5){
         case 1:

//       case 1:

 }

     switch(5){
         case 01:
     
//       case 1:
     }

      switch(5){
        
          case 012:

          case 12:
    
     }

      switch(5){

          case 014:

//        case 12:

      }

       switch(5){
          
           case 1:
      }

       switch(5){
          
           default:
     }

       switch(5){
          
           case 1:
          
           case 2:
  
           case 3:
   
           case 4:
}

       switch(5){

          default:

//        default:
     }
       
       switch(5){

          case 4:

          case 1:

          case 2:
     }

       switch(5){

          case 4:

          case 1:

          case 2:

          default:
     }

      switch(5){
    
         default:
   
         case 1:
    }

      switch(5){

          case 4:

          case 1:

          default:

          case 2:

     }
        
       switch(5){

         default:
             System.out.println("Hi");
         case 5:
             System.out.println("Hello");
       }
      System.out.println();

        switch(5){

         default:
             System.out.println("Hi");
         case 1:
             System.out.println("Hello");
       }
       System.out.println();
   
        switch(5){

         default:
             System.out.println("Hi");
         case 1:
             System.out.println("Hello");
         case 3:
             System.out.println("Hello");
       }
       System.out.println();
         
        switch(5){

         default:
             System.out.println("Hi");
         case 1:
             System.out.println("Hello");
         case 5:
             System.out.println("Hello");
       }
       System.out.println();
       
         switch(5){

         default:
             System.out.println("Hi");
         case 5:
             System.out.println("Hello");
         case 1:
             System.out.println("Hello");
       }
       System.out.println();
       
         switch(5){

         default:
             System.out.println("Hi");
             break;
         case 1:
             System.out.println("Hello");
         case 2:
             System.out.println("Hello");
       }
       


	}
}
