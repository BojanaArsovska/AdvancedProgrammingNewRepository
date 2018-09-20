
public interface IdentifierInterface{
/*
 *
 * Elements: Characters of type char
 * Structure: Linear
 * Domain:  
 * 	-first letter is a alphabetic character
 *  -only alphanumeric characters
 *  -minimum of 1 character
 *  
 *  
 * constructors
 *
 * NumberStack();
 *   PRE  - 
 *   POST -A new NumberStack-object has been made and contains the empty stack.
 *
 * NumberStack (NumberStack src); this is the copy constructor
 *   PRE  - 
 *   POST - A new NumberStack-object has been made and contains a copy of src.
 * 
 */
	
// initalize the object with "a" which then gets overwritten so that an identifier is never empty 
// gets overwritten by function called init(char a); 
// every ADT needs an init
// add function
// remove function needs to check that the identigier is empty 
// copy constructor needs to be a deep copy 
	

	void init(char a);
	

}
