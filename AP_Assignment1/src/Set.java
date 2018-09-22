// Interface
// structure NONE
// specification return booleans if user input acceptable
// remove cannot remove elements
// get returns random because there is no order


public class Set {
	
	public static final int INITIAL_AMOUNT_OF_IDENTIFIERS = 20;

	private Identifier[] identifiers; 
	
	public Set() {
		this.identifiers = new Identifier[INITIAL_AMOUNT_OF_IDENTIFIERS];
	}

	public Identifier[] getIdentifiers() {
		return identifiers;
	}

	public void setIdentifiers(Identifier[] identifiers) {
		this.identifiers = identifiers;
	}
	
	public void init() {
		this.identifiers = new Identifier[INITIAL_AMOUNT_OF_IDENTIFIERS];
	}
	/* PRE  - 
	   POST - initializes the set object
	*/
	
	void add(Identifier id) {}
	/* PRE  - an Set object exists, has less than 10 identifiers, isUnique needs to return true for given identifier
	   POST - an identifier is added at the last position 
	*/
	
	boolean isUnique(Identifier id) {
		
		return true; }
	/* PRE  - 
	   POST - returns true is identifier addition is possible, 
	   		  identifier addition is only possible if identifier is Unique 
	   	      (i.e. not a duplicate of an already existing identifier)
	*/
	
	
	
	//get function (there is no structure) you could return an identifier at position zero 
	

	
	
	public String toString() { return ""; }
	/* PRE  - 
	   POST - StringBuilder identifier is turned into a string and returned
	*/
	
}
	
	
	


