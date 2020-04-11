//Rule #13: working with variables in switch blocks 

//1)we can declare variables in switch case either with {} or without {}

//2)the variable declared in one case without{},
//        it can not be accessed in other case or default
//            for assignment even though we have used break

//3)the variable declared in one case with {}
//        it can not be accessed in other cases or default
//             compiler will throw error

//4)the variable declared in one case without{}
//      it can not be redeclared in other cases or default
//            compiler will throw error
//
//5) the variable declared in one case with {}
//      it can be redeclared in other cases or default
//            compiler will not throw error

//6)the variable declared in one case with or without {}
//         it can not be accessed for reading its value
//            in other cases or default
//               compiler will throw error

//7)the variable declared in one case without {}
//     it can accessed for reading its value
//       if we assign it in current case or default
//            in other case or default compiler will throw error
//
//8)the variable declared in one case 
//      it can not be accessed after switch {}
//         compiler will throw error

//9)If we want to access the variable after switch {}
//     we must declare before switch {}
//         then compiler will not throw error

//10)If we declare variable before switch {}
//      and if we initialize variable in only one case or in all cases
//         but not in default,we can not access this variable after
//            switch{} for reading its value,then compiler will throw error 

//11)If we want to declare variable before switch {}
//      and want to initialize variable in switch cases
//      and want to read this variable after switch{}
//      we must initialize this variable either with some
//      default value at the time of daclaration before switch{}
//      or we must assign it in default case also 

//12)If we initialize variable in switch case and also in default 
//        if we do not use break at end of case,
//           after switch block always we will get default case value 

//13)If we declare variable before switch{},
//     we can not declare this variable again in switch{}
//       compiler will throw error.Inside switch we can either 
//         assign or read this value

//14)If we declare variable inside switch {},
//      we can again declare this variable after switch{}
//        compiler will not throw error.
//       but we can not assign or read value outside of the switch 
//          compiler will throw error    
              

class Test36_switch_Rule13{
	public static void main(String[] args){

     switch(5){
        case 1:
          int a=10;

        default :
          int b=20;
      }
      
     switch(5){
        case 1:{
           int a=10;
         }
        default :{
           int b=20;
         }
       }
      
      switch(5){
          case 1:
              int a=10;
          
          case 2:
              a=20;

           default :
              a=30;
       }
      
	
      switch(5){
          case 1:
            int a=10;
            break;

          case 2:
             a=20;

          default :
             a=30;
     }

      switch(5){
            case 1:{
               int a=10;
            }
            case 2:
//              a=20;

            default :
//              a=30;
      }

      switch(5){
            case 1:
               int a=10;
            
            case 2: 
//             int a=20;

            default :
//              int a=30;
        }
        
      switch(5){
            case 1:{
               int a=10;
            }
            case 2:{ 
             int a=20;
            }
            default :{
              int a=30;
        }
      }
       
        switch(2){
             case 1:
                int a=10;

             case 2:
//       System.out.println(a);

             default :
//       System.out.println(a);
        }

        switch(5){
           
            case 1:
                int a=10;

            case 2:
                a=20;
               System.out.println(a);

             default:
                 a=30;
                System.out.println(a);
           }

          switch(5){
           
            case 1:{
                int a=10;
             }
            case 2:
//              a=20;
//              System.out.println(a);

             default:
//              a=30;
//              System.out.println(a);
           }

           switch(5){
           
            case 1:
                int a=10;
                System.out.println(a);
            case 2:
//              int a=20;
//              System.out.println(a);

             default:
//               a=30;
//               System.out.println(a);
           }

          switch(5){
           
            case 1:{
                int a=10;
                System.out.println(a);
               }
            case 2:{
              int a=20;
              System.out.println(a);
              }
             default:
              int a=30;
               System.out.println(a);
              
           }

          switch(5){
           
            case 1:
                int a=10;
                System.out.println(a);
            case 2:
              a=20;
              System.out.println(a);

             default:
               a=30;
               System.out.println(a);
           }//-->switch close
//        System.out.println(a);

         int a=10;
         switch(5){
             case 1:
                a=15;
            }
       System.out.println(a);

          int b=10;
           switch(5){
               case 5:
                  b=15;
            }
        System.out.println(b);
         
          int c;
          switch(5){
             case 1:
                c=10;
           }
//        System.out.println(c);

          int d;
          switch(5){
               case 5:
                  d=10;
            }
//         System.out.println(d);

          int e;
          switch(5){
            case 1:
                e=10;
            
           default:
                e=50;
        System.out.println(e);
      }
        int f;
        switch(1){
          case 1:
             f=10;

           default :
              f=50;
        }
       System.out.println(f);

        int g;
         switch(1){
            case 1:
               g=10;
               break;
            
             default :
                g=50;
          }
         System.out.println(g);

          int h=-1;
           switch(5){
               case 1:
                  h=10;
          }
         System.out.println(h);

         int i=-1;
         switch(5){
            case 5:
               i=10;
          }
         System.out.println(i);

         int j;
          switch(5){
             case 1:
                 j=10;

              case 2:


              default:
                  j=30;
          }
         System.out.println(j);

          int k;
          switch(5){
              case 1:
                 k=10;

              case 2:
                 break;

              default:
                 k=30;
          }
//       System.out.println(k);

          int l=-1;
          switch(5){
              case 1:
//               int l=10;
          }
         System.out.println(l);

           switch(5){
               case 1:
                  int m=10;
             }
           int m=20;
           System.out.println(m);

            switch(5){
                case 1:
                   int n=10;
             }
//            n=20;
//           System.out.println(n); 
          

	}
}
