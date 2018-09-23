
public interface IdentifierInterface{
/*
 * Elements: Characters of type char
 * Structure: Linear
 * Domain:  
 * 	- first letter is a alphabetic character
 *  - only alphanumeric characters
 *  - minimum of 1 character
 *  
 * Identifier ();
 *   PRE  - N/A
 *   POST - default constructor.
 *   
 * Identifier (char a);
 *   PRE  - N/A
 *   POST - A new Identifier-object has been made and contains an Identifier object with a dummy ('a') alphabetic character.
 *
 * Identifier (Identifier src); 
 *   PRE  - N/A
 *   POST - A new Identifier-object has been made and contains a deep copy of src.
 */
	
// initialize the object with "a" which then gets overwritten so that an identifier is never empty 
// gets overwritten by function called init(char a); 
// every ADT needs an init
// add function
// remove function needs to check that the identifier is empty 
// get function
	

	void init(char a);
	/* PRE  - 
	   POST - initializes an identifier with the user input, takes a char as an argument and puts it at the front of the StringBuilder, this method overwrites the dummy character.
	*/
	
	void add(char a);
	/* PRE  - an Identifier exists
	   POST - a character is added to the 
	*/
	
	void remove(char a);
	/* PRE  - an Identifier exists and cannot remove the last character from the identifier (i.e. domain must hold at any time)
	   POST - a character at the last index is removed from the StringBuilder object
	*/
	
	void set(char a, int index);
	/* PRE  - an Identifier exists
	   POST - a character is set at an index in the StringBuilder object
	*/
	
	
	// Harsh: "equals method that takes an Identifier as input and returns true if this is same to input
	
	// Harsh: "getter and setter methods for class variables
	
	// Harsh "boolean function isValid which returns if this identifier isValid or not"
	
		
	
	
}

/*
 * misc sander notes
 * for push there is no pre condition but there could be, there is none becuase its easier to have something else check it by checking something outside of the class
 * 
 * 
*/
