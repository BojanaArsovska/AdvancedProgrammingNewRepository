//  The identifiers must have the following properties:
//	Only alphanumeric characters are allowed as elements of an identifier
//  An identifier begins with a letter
//	Identifiers have a length of at least 1 character.

class Identifier implements IdentifierInterface {
	
	private static final char DUMMY_CHAR = 'a';

	private StringBuilder word;
	private boolean hasDummyChar;
	
	public Identifier() {
		this.word = new StringBuilder(DUMMY_CHAR);
		this.hasDummyChar = true;
	}
	
	
	
	public void init() {
		Identifier identifier = new Identifier();
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
}
