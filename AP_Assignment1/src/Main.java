import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner; 

public class Main {
	
	final String EMPTY_STRING = "";
	final boolean matthiasTest = false;
	
	Scanner in1;
	Scanner in2;
	PrintStream out;
	ArrayList<String> set1; // you'll have to create ADT Set
	ArrayList<String> set2;
	
	public Main() {
		// can '{' or '}' be a part of any identifier?
		
		in1 = new Scanner("test this")  ; //first set input
		in2 = new Scanner("b1 b2 b3 b4 b5}"); //second set input
		out = new PrintStream(System.out); //printing to System.out- terminal/console
		set1 = new ArrayList<>();
		set2 = new ArrayList<>();
		
		in1.useDelimiter(EMPTY_STRING);
		in2.useDelimiter(EMPTY_STRING);
	}
	
	public static void main (String args[]) {
		new Main().start(); //creating an object of the Main class to avoid making every function static // still don't get this
	}
	
	public void start() { //created to avoid 
		//read the first set
		out.println("Give the the first set: ");
		parseInput(in1, set1);
		
		//read the second set
		out.println("Give the the second set: ");
		parseInput(in2, set2);
		
		printList(set1);
		printList(set2);
	}
	
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
		for(int i=0; i<list.size(); i++) {
			out.println(list.get(i));
		}
	}
	
	public char readNextChar(Scanner in) {
		return in.next().charAt(0);
	}
}
