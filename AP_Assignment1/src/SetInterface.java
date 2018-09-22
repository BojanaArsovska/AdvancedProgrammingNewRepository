public interface SetInterface {
/*
 *
 * Elements: identifiers of the type Identifier
 * Structure: None
 * Domain:
 * 	 - Only identifiers are allowed as elements of a set.
 *	 - Sets contain a minimum of 0 and a maximum of 20 identifiers.
 *
 * constructors
 *
 *Set();
 *  //PRE  - 
 *  //POST -A new Set-object has been made and contains the empty set.
 *
 * Set (Set src);
 *   //PRE  - 
 *   //POST - A new Set-object has been made and contains a copy of src.
 *
 *
 * 
*/	
	
	void init(char a);
	/* PRE  - 
	   POST - initializes an identifier with the user input, takes a char as an argument and puts it at the front of the StringBuilder, this method overwrites the dummy character.
	*/
	
	void add(char a);
	/* PRE  - an Set object exists
	   POST - a character is added to the 
	*/
	
	void isUnique(Identifier id);
	/* PRE  - 
	   POST - if you can add element to the set return true if you cannot add element (because its not unique then it returns false)
	*/
	
	void remove(char a);
	/* PRE  - an Identifier exists and cannot remove the last character from the identifier (i.e. domain must hold at any time)
	   POST - a character at the last index is removed from the StringBuilder object
	   SANDER NOTE - should return a boolean if you try to remove an element that was not there
	*/
	
	//get function (there is no structure) you could return an identifier at position zero 
	
	
	
	void set(char a, int index);
	/* PRE  - an Identifier exists
	   POST - a character is set at an index in the StringBuilder object
	*/
}
