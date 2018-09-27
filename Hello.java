import revlib.StringReverser; 

public class Hello {

public static void main(String[] args) {
  System.out.println("Hello World");
	for(int i=0; i< args.length; i++){
 	String s = args[i];
	StringReverser rev = new StringReverser(s); 
	System.out.println("-> "+rev.getStringReversedString());
	}
  
}

}