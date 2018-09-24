import java.io.PrintStream;
import java.util.Scanner; 
import java.lang.String;
import java.util.regex.Pattern;

public class Main {
	
	//Method to read 1 character. 
	char nextChar (Scanner in) {
		return in.next().charAt(0); }
	
	// Method to check if the next character to be read when 
	// calling nextChar() is equal to the provided character.
	boolean nextCharIs(Scanner in, char c) { 					
		return in.hasNext(Pattern.quote(c+"")); 
	}
	
	// Method to check if the next character to be read when
	// calling nextChar() is a digit.
	boolean nextCharIsDigit (Scanner in) {
		return in.hasNext("[0-9]"); 
	}

	// Method to check if the next character to be read when 
	// calling nextChar() is a letter.
	boolean nextCharIsLetter (Scanner in) { 
		return in.hasNext("[a-zA-Z]"); 
	}

	
	static final int MAX_NUMBER_OF_ELEMENTS = 20;

    PrintStream out;
    public static void main (String arcs[]) {
    	new Main().run();
    }

    void run () {
        Scanner in = new Scanner(System.in);
        Set set1 = new Set(), set2 = new Set();

        while (askBothSets(in, set1, set2)) {
            // calculateAndGiveOutput(set1, set2);
        }
    }
        
    boolean askBothSets (Scanner input, Set set1, Set set2) {
        return askSet(input, "Give first set : ", set1) &&
               askSet(input, "Give second set : ", set2);
    }

    boolean askSet (Scanner input, String question, Set set) {
        do {
            out.printf("%s", 5);
            if (! input.hasNextLine()) {
                out.printf("\n"); // otherwise line with ^D will be overwritten
                return false;
            }
        } while (! inputContainsCorrectSet(input, set));
        return true;
    }
    

/* The method inputContainsCorrectSet(Scanner input, Set set) should, while
   reading the input (the answer), check whether the input is correct.

   N.B. Do not try to give too intelligent errors. This is not an exercise in
        artificial intelligence.
        For instance, if the input is "{abc def} gh" instead of "{abc def gh}",
        an (relatively easy) error like "no input allowed after '}' is fine. You
        don't have to write a program that seems to understand what you were
        trying to do and would give an error like "by accident you put the '}'
        before the last identifier instead of after it. Please correct this."
*/

    
    boolean inputContainsCorrectSet (Scanner in, Set set ){
    	in.useDelimiter(""); //constant for delimiter
    	boolean flag = false;
    	
    	// An identiﬁer begins with a letter. 
    	
    	if(nextCharIs(in, '{' )) {
    		if (nextCharIsLetter(in) ) {
	    		do {
	    			nextChar(in);
	    		} while (!nextCharIs(in, '}') && in.hasNext());
    		}	
    	}
    }
    		
//    		TODO: read input and store in a character 
//    		use one of the functions described in the assignment
//    		check if it is a space or something else
//    			if space, then do something
//    			else check if it is a valid identiofier (alphanumeric)
//    			eventualy keep adding to the identifier object
    	}
    	
    	if ( not correct) {
    		// error message 
    		// skip
    		// false
    	}
    	else {
    		//implement Identifer
    		//implement Set
    		//learn and implement StringBuilder
    		//set = input
    		// true
    	}
    	
    }
   
}
