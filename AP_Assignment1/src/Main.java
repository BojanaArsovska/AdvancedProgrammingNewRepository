import java.io.PrintStream;
import java.util.Scanner; 
import java.lang.String;


public class Main {
	
	static final int MAX_NUMBER_OF_ELEMENTS = 10;

    PrintStream out;
    public static void main (String arcs[]) {
    	new Main().start();
    }

    void start () {
        Scanner in = new Scanner(System.in);
        Set set1 = new Set(), set2 = new Set();

        while (askBothSets(in, set1, set2)) {
            out.printf("%s", calculateOutput(set1, set2));
        }
    }
        
    boolean askBothSets (Scanner input, Set set1, Set set2) {
        return askSet(input, "Give first set : ", set1) &&
               askSet(input, "Give second set : ", set2);
    }

    boolean askSet (Scanner input, String question, Set set) {
        do {
            out.printf("%s", question);
            if (! input.hasNextLine()) {
                out.printf("\n"); // otherwise line with ^D will be overwritten
                return false;
            }
        } while (!inputContainsCorrectSet(input, set));
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
 
    boolean inputContainsCorrectSet (Scanner in, Set set){
    	//set delimeter of scanner
    	String nextInputWord = "";
    	char nextChar; 	
    	
    	while(in.hasNext()) {
    		nextChar = in.next().charAt(0);
    		
    		if(nextChar. == ' ' || nextChar '\n' || nextChar == '{') {
    			if(in.hasNext()) {
    				
    			}
    				
    			//create a new identifier
    			if(nextInputWord.length() > 0) {
    				set.add(nextChar);
    			}
    			
    		}
    		
    		else {
    			nextInputWord += nextChar;
    		}
    	}
    		
		if(nextInputWord.length() > 0) {
			set.add(nextInputWord);
		}
		return true;
    }
		
    		
    		
//    		read input and store in a character 
//    		use one of the functions described in the assignment
//    		check if it is a space or something else
//    			if space, then do something
//    			else check if it is a valid identifier (alphanumeric)
//    			eventually keep adding to the identifier object
    	
    
    String calculateOutput(Set set1, Set set2) {
    	
    	return "difference = " + set1.difference(set2).toString() + "\n" + 
    		   "intersection = " + set1.intersection(set2).toString() + "\n" + 
    	       "union = " + set1.union(set2).toString() + "\n" + 
    		   "sym. diff. = " + set1.symmetricDifference(set2).toString() + "\n";
    }
    
    	
    	
    
   
}
