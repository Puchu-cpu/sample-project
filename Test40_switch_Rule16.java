//Rule #16:
//Nested switch block

class Test40_switch_Rule16{
	public static void main(String[] args){
		int a=1;
        switch(a){
             case 1:
                switch(a+1){
                     case 2:
                        System.out.println("Inner switch case");
                     }
             }
	   }
}
