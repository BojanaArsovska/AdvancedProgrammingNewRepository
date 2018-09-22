import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner; 
import java.lang.String;
import java.lang.StringBuilder;
/*Sander Notes
	-the main body of the program should not be in a main try catch 
	-prevent try catch and throw the least amount of try catch blocks
	-the try catch blocks get nested and tricky
	-try not to use too many
	-one try catch block for the parser
	-Missing is done to a single catch block



 NOTES FROM LECTURE 
- every methods that are in the specification should be public in the implementation
- therefore all the methods from the implementation that are not in the specification should be private
- no read() or write() methods inside the specification
   → elementary operations to program read() and write() should be in the specification
- read()
   → init()
   → push()
- write()
   → pop()
   → isEmpty()

- assignment 1
- 2 classes
   → Identifier
      ⇒ add element by element
      ⇒ elementary operation returning character by character
   → Set

- what can be put in an interface:
   → constants
   → headings of methods

- in the implementation of an interface:
   → all constants from the interface are copied
   → all methods should be implemented

- difference String and StringBuffer
   → strings are imutable (cannot change their content)
   → StringBuffer = row of characters where you can change the content
   → StringBuffer are more efficient


~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Set union(Set rhs) throws Exception;
/* PRE - the union of this 2 sets shouldn't contain more than 20 elements
   POST - SUCESS: the union of the 2 sets has be calculated and is returned
          FAILURE: union > 20 elements
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


- the interface should at least contain those methods
   → default constructor, copy constructor, init()
   → elementary opertions for read and write
   → natural operations for this object
   → operations forced by PRE conditions
 */


public class Main {
	
	final String EMPTY_STRING = "";
	
	Scanner in1; //TODO: remove global variable 
	Scanner in2; 
	PrintStream out;
	ArrayList<String> set1; 
	ArrayList<String> set2;
	
	public Main() {
		
		//first set input
		in1 = new Scanner(System.in)  ; 
		//second set input
		in2 = new Scanner("b1 b2 b3 b4 b5}"); 
		
		//printing to System.out- terminal/console
		out = new PrintStream(System.out); 
		
		set1 = new ArrayList<>();
		set2 = new ArrayList<>();
		
		in1.useDelimiter(EMPTY_STRING);
		in2.useDelimiter(EMPTY_STRING);
	}
	
	public static void main (String args[]) {
		new Main().start(); 

	}
	
	public void start() { 
		
		//read the first set
		out.println("Give the first set: ");
		parseInput(in1, set1);
		
		//read the second set
		out.println("Give the second set: ");
		parseInput(in2, set2);
		
		printList(set1);
		printList(set2);
	}
	
	// FROM A1 Absence of input is not seen as an error, but should lead to a repeat of the question.
	public void parseInput(Scanner in, ArrayList<String> set) {
		String nextInputWord = ""; // convert this to Abstract Data Type called Identifier
		char nextChar;
		while(in.hasNext()) {
			nextChar = readNextChar(in);
			
			//add checks for other characters
			if(nextChar == ' ' || nextChar == '\n') {
				if(nextInputWord.length() > 0) {
					//before adding the next identifier to the set, make a check
					set.add(nextInputWord);
					nextInputWord = "";
				}
			} else {
				nextInputWord += nextChar;
			}
		}
		
		//read the last word from the input
		if(nextInputWord.length() > 0) {
			set.add(nextInputWord);
		}
	}
	
	public void printList(ArrayList<String> list) {
		for(int i = 0; i < list.size(); i++) {
			out.println(list.get(i));
		}
	}
	
	public char readNextChar(Scanner in) {
		return in.next().charAt(0);
	}
}
