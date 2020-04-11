//Rule #5:
//Like in if(-) we can not place ";"
//after switch(-) and before '{'
//compiler will throw error

class Test26_switch_Rule5{
	public static void main(String[] args){
		
		if(true);{
		System.out.println("Hi");
		}

		switch(5);{
			case 5:
			System.out.println("Hi");//CE:case,default or } expected
		}

	}
}
