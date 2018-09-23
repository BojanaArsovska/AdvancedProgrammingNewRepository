
public interface SetInterface{
/*
 * Elements: Unique Sets
 * Structure: Linear
 * Domain: Sets made of alphanumeric characters
 * 
 * Costructors:  
 * Set ();
 *   PRE  - N/A
 *   POST - A new Set-object has been made and contains the empty Set.
 *   
 * Set (Set src); 
 *   PRE  - N/A
 *   POST - A new Set-object has been made and contains a copy of src.
 */
	static final int MAX_AMOUNT_OF_ELEMENTS = 20;
			
	void init();
	/* PRE  - 
	   POST - The Set is empty. 
	*/
	
	void add(Identifier identifier);
	/* PRE  - the set has not reached the max size
	   POST - the identifier has been added to the set.
	*/
	
	void remove(Identifier identifier);
	/* PRE  - the set contains identifier
	   POST - the identifier has been removed from the set.
	*/
	
	boolean isEmpty ();
	/* PRE  - 
	   POST - true:  The amount of identifiers of the Set equals 0.
	          false: the amount of identifiers of the Set is greater than 0.
	*/

	int size ();
	/* PRE  - 
	   POST - The amount of identifiers of the Set has been returned.
	*/

	boolean equals(Set other);
	/* PRE  - 
	   POST - true:  The current Set is identical to the other.
	          false: The current Set isn't identical to the other
	*/
	
	boolean contains(Identifier identifier);
	/* PRE  - 
	   POST - true:  The current Set contains identifier.
	          false: The current Set does not contain identifier.
	*/
	
	Set union(Set other);
	/* PRE  - 
	   POST - The union of this set and other has been returned.
	*/
	
	Set difference(Set other);
	/* PRE  - 
	   POST - The difference of this set and other has been returned.
	*/
	
	Set intersection(Set other);
	/* PRE  - 
	   POST - The intersection of this set and other has been returned.
	*/
	
	Set symmetricDifference(Set other);
	/* PRE  - 
	   POST - The symmetric difference of this set and other has been returned.
	*/
	
	String toString();
	/* PRE  - 
	   POST - The identifiers of the Set has been returned as a String object.
	*/
}
