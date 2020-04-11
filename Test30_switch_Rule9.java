//Rule #9:
//The case lable must be a compile time constant or constant expression and
//The lable type must be compatible and its range must be lesser than or equals
//switch argument type

//it must not a variable r variable expression or method call 
//compiler will throw error

//the allowed constant types as case lable are
// 1.int,char,byte,short
// 2.enum named constants
// 3.String literals

//if use int as switch argument the allowed types for lable are int/char/byte/short
//if use char as switch argument the allowed types for lable are int*/char/byte/short
// if use WC Byte object as switch argument the allowed types for lable only int*/char/byte/short
// if use WC Short object as switch argument the allowed types for lable only int*/char/byte/short
// if use WC Integer object as switch argument the allowed types for lable only int
// if use WC Character object as switch argument the allowed types for lable 
// char/byte/short/int
//if use enum as switch argument the allowed types are only its named constants
//if use String as switch argument the allowed types are only String literals

class Test30_switch_Rule9{
	public static void main(String[] args){
		int x=10;
		final int y=5;
		final int z;
		z=6;
		switch(x){
        
		case x:
		  System.out.println("Hi");

		case y:
			System.out.println("Hi");

		case z:
			System.out.println("Hi");

		case 1:
			System.out.println("Hello");

		case'a':
			System.out.println("Hello");

		case "a":
			System.out.println("Hi");

		case 7L:
			System.out.println("Hi");

		case (int)7L:
			System.out.println("Hi");

		case (int)x:
			System.out.println("Hi");

		case 5+7:
			System.out.println("Hi");

		case y+7:
			System.out.println("Hi");
           
        case y+8:
			System.out.println("Hi");

		case x+9:
			System.out.println("Hi");

		case z+10:
			System.out.println("Hi");

		case m1():
			System.out.println("Hi");

		case new Integer(25):
			System.out.println("Hi");
		}
	}
	static int m1(){
		return 15;
	}
	static void m2(){
		Integer io=5;

		switch(io){

         case io:
			 System.out.println("Hi");
		 
		 case new Integer(5);
		     System.out.println("Hi");
			 
         case 5:
			 System.out.println("Hi");

		 case 'a':
			 System.out.println("Hi");

		 case(int)'b':
             System.out.println("Hi");

//		 case(byte)'a':
//			 System.out.println("Hi");
			
//         case(byte)5:
//			 System.out.println("Hi");

//		 case(short)5:
//			 System.out.println("Hi");
		}
	}
	static void m3(){
		Character co='a';

		switch(co){
			
			case co:
				System.out.println("Hi");

			case new Character('a'):
				System.out.println("Hi");

			case 97:
				System.out.println("Hi");

//			case 'a':
//				System.out.println("Hi");

		    case 'b':
				System.out.println("Hi");

			case (int)'c':
				System.out.println("Hi");

			case(byte)'d':
				System.out.println("Hi");

			case(short)'e':
				System.out.println("Hi");
		}
	}

	static void m4(){
		String s="a";
		final String s2="b";
		final String s3=new String("c");
		final String s4="p"+"q";

		switch(s){

//			case s:
            case "a":
            case "A":
//            case new String("a"):
//            case s.toUpperCase():
            case "a"+"b":
//            case s+"b":
            
			case s2:
			case s2+"b":
            case s2+s:

            case s3:
            case s4:
            case "":
            case " ":
            case "1":
            case "10":
            case "$":
            case ",":
//          case """:
            case "\"":
//          case "\":
            case "\\":

//			case 'a':
//			case 5:
		}
	}

	static void m5(){
		switch(Day.TUE){

			case MON:
			case TUE:
			case WED:
//			case THU:

			case Day.MON:
//			case "MON":
//			case 1:

//          case MON:
		}
	}

	static void m6(){
		Byte bo=5;

		switch(bo){

//			case bo:
//          case new Byte((byte)5):

            case 5:
            case -5:
//          case 150:
//          case -150:
            case 127:
            case -128:

            case 'a':
            case (int)'b':
//          case (byte)'a':
            case (byte)'c':
            
			case (byte)5:
				System.out.println("Hi");
			case (short)5:
		}
	}
}
enum Day{
	MON,TUE,WED
	}
	}
}
