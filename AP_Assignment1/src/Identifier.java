class Identifier implements IdentifierInterface {
	
	private static final char DUMMY_CHAR = 'a';

	private StringBuilder word;
	private boolean hasDummyChar;
	
	public Identifier() {
		this.word = new StringBuilder(DUMMY_CHAR);
		this.hasDummyChar = true;
	}
	
	/*
	public Identifier(Identifier src) {
		Identifier identifierCopy = new Identifier(src);
	}
	*/
	
	//the motivation for this choice came from 
	//url: https://stackoverflow.com/questions/4199429/proper-way-to-deep-copy-with-copy-constructor-instead-of-object-clone
	
	public Identifier clone() {
		return (Identifier) clone();    
	}
	
	public void init(char a) {
		Identifier identifier = new Identifier();
		
		//replace takes a string only and the identifiers domain must always hold 
		String aString = "" + a;
		this.word.replace(0, 1, aString);
		this.hasDummyChar = false;	
	}
	
	public void add(char a) {
		if(hasDummyChar) {
			this.word.delete(0,1);
			hasDummyChar = false;
		}
		this.word.append(a);
	}
	
	public void remove(int startIndex, int endIndex) {
		if(startIndex == 0 && endIndex == 1 && this.word.length() == 1) {
			this.word.insert(0, DUMMY_CHAR);
			this.hasDummyChar = true;
		} else {
			this.word.delete(startIndex, endIndex);
		}
	}
	
	public void set(int index, char a) {
		String aString = "" + a;
		this.word.insert(index, aString);
	}
	
	public char getChar(int index) {
		return this.word.charAt(index);
	}
	
	public String toString() {
		return this.word + "";
	}
}

/*
 * The difference between a shallow copy and a deep copy is that for eample you have identifier p you put it in set A you copy set A with all its references which means
 *  P b also has a identifier reference to the same object but if in A you were for examle chan it would also be changed in P a deep copy goes deeper and also copies the idenitifier in the copy of the set 
 */