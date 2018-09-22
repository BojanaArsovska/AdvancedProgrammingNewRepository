public interface SetInterface {
/*
 * Elements: identifiers of the type Identifier
 * Structure: None
 * Domain:
 * 	 - Only identifiers are allowed as elements of a set.
 * 	 - Identifiers cannot be duplicates of each other
 *	 - Sets contain a minimum of 0 and the union of the sets is strictly less than 20 identifiers.
 *
 * Constructors
 *
 * Set();
 *  PRE  - 
 *  POST - A new Set-object has been made and contains the empty set.
 *
 * Set (Set src);
 *   PRE  - 
 *   POST - A new Set-object has been made and creates a deep copy of src.
 *
 MISC SANDER NOTES
*/	

	void init();
	/* PRE  - 
	   POST - initializes the set object
	*/
	
	void add(Identifier id);
	/* PRE  - an Set object exists, has less than 20 identifiers or the union of both sets is less than 20, isUnique needs to return true for given identifier
	   POST - an identifier is added at the last position 
	*/
	
	boolean isUnique(Identifier id);
	/* PRE  - 
	   POST - returns true is identifier addition is possible, 
	   		  identifier addition is only possible if identifier is Unique 
	   	      (i.e. not a duplicate of an already existing identifier)
	*/
	
	boolean removeIdentifier();
	/* PRE  - more than 0 identifiers are present in set object
	   POST - an 
	   SANDER NOTE - should return a boolean if you try to remove an element that was not there
	*/
	
	//get function (there is no structure) you could return an identifier at position zero 
	
	Identifier[] getIdentifiers();
	/* PRE  - 
	   POST -  
	*/
	
	Set getSet();
	/* PRE  - set exists
	   POST -  a set is returned
	*/
	

	void setIdentifiers(Identifier[] identifiers);
	/* PRE  - set position is not out of bounds
	   POST -  identifier at position is set
	*/
	
	String toString();
	/* PRE  - 
	   POST - StringBuilder identifier is turned into a string and returned
	*/
	
	
	
	
}
