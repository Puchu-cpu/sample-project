//Rule #1:As switch argument,
//The allowed things as switch argument are
       ////-literal/variable name/expression/method call

//-we can also place variable initialization or assignment
//-but we can notnplace variable declaration direcly in switch(-)

 
    
class  Test22_switch_Rule1{
	public static void main(String[] args){
//	switch(int x=5){}//CE:
		int x;
		switch(x=5){}
		switch(5){}

        int a=4;
		switch(a){}

		switch(5+6){}

		switch(a+3){}

		switch(m1()){}
	}//main close

	   static int m1(){
		   return 10;
	   }
		
	}

