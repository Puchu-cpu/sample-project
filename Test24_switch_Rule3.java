//Rule #3:
//We can place empty switch(-){} block
//case and default are optional

//But we can not place any statement directly
//inside switch(-){} block without case or default 
//compiler will throw error

//even ; also not allowed without case or default

class Test24_switch_Rule3{
	public static void main(String[] args){
		switch(5){}

//        switch(5){
//		  System.out.println("Hi");
//		  }

//		switch(5){
//			;
//		}
        
		switch(5){
			case 5:
             System.out.println("Hi");
		}
	}
}
