//Rule #2:The switch argument type must be,
   //-int/short/byte/char               (From Java 1.0)
   //-Integer/Short/Byte/Character      (From Java 1.5)
   //-enum type(ex:Day,Color,Course)    (From Java 1.5)
   //-String                            (From Java 1.7)

   //Not allowed types
     //-long/float/double/boolean
	 //-Long/Float/Double/Boolean
	 //-Normal class objects/array objects
class Test23_switch_Rule2{
	public static void main(String[] args){

		switch(5){}
		switch('a'){}

/*
        switch(5L){}
        switch(5.0F){}
        switch(5.0){}
        switch(true){}

		long l=5L;
		switch(l){}

		float f=5;
		switch(f){};
        
		double d=5;
		switch(d){}
*/

        switch(10){}

		int i1=10;
		switch(i1){}

		Integer io=7; //-->(Java 5version new feature Auto Boxing)
		switch(io){}

		switch('a'){}

		char ch='a';
		switch()ch{}

		Character co='a';  //-->(Java 5version new feature Auto Boxing)
		switch(co){}

		switch("a"){}  //(Java 7v new feature switch with String)

		String s="a";
		switch(s){}

		Day day=Day.MON;
		switch(day){}

		switch(Day.TUE){}

		
	}//-->main close
}//-->class close

enum Day{
	MON,TUE,WED,THU,FRI,SAT,SUN
}

/*To verify above new features,compile above program with Java 1.4 and Java 1.6v compiler
  
  you will get compile time errors at switch(io),switch(co),and switch(s)

  For compiling a program with lesser version compiler by using higher version
  JDK software.

  we must use -source option with javac command as shown below
  >java -source <lesser version> <java source file name>