
public interface IdentifierInterface{
/*
 * Elements: Characters of type char
 * Structure: Linear
 * Domain: Only alphanumeric characters
 *  
 * Identifier ();
 *   PRE  - N/A
 *   POST - A new Identifier-object has been made and contains the empty identifer.
 *   
 * Identifier (Identifier src); 
 *   PRE  - N/A
 *   POST - A new Identifier-object has been made and contains a copy of src.
 */
	void init(char a);
	/* PRE  - 
	   POST - The new identifier object has been initialized with the input a. 
	*/
	
	void add(char a);
	/* PRE  - an Identifier with size > 1 exists
	   POST - a character is added to the current identifier
	*/
	
	void remove(char a);
	/* PRE  - an Identifier exists and cannot remove the last character from the identifier (i.e. domain must hold at any time)
	   POST - a character at the last index is removed from the StringBuilder object
	*/
	
	boolean isEmpty ();
	/* PRE  - 
	   POST - true:  The amount of characters of the identifier equals 0.
	          false: the amount of characters of the identifier is greater than 0.
	*/

	int size ();
	/* PRE  - 
	   POST - The amount of characters of the identifier has been returned.
	*/

	boolean equals(Identifier other);
	/* PRE  - 
	   POST - true:  The current identifier is identical to the other.
	          false: The current identifier isn't identical to the other
	*/
	
	String toString();
	/* PRE  - 
	   POST - The characters of the identifier has been returned as a String object.
	*/
}
