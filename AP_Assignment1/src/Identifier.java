//  The identifiers must have the following properties:
//	Only alphanumeric characters are allowed as elements of an identifier
//  An identifier begins with a letter
//	Identifiers have a length of at least 1 character.

class Identifier implements IdentifierInterface {
	
	private static final int INITIAL_AMOUNT_OF_ELEMENTS = 1;

    private char[] array;
    private int amountOfElements;
    
    
	public Identifier() {
		array = new char[INITIAL_AMOUNT_OF_ELEMENTS];
		amountOfElements = 0;
	}
	
	private void copyElements (char[] dest, char[] src, int amount){
		for (int i = 0; i < amount; i++) {
			dest[i] = src[i];
		}
	}
	
	public Identifier (Identifier src) {
		array = new char [src.array.length];
		amountOfElements = src.amountOfElements;
		copyElements(array, src.array, amountOfElements);
	}
	
	public void init(char a) {
		array[0] = a;
		amountOfElements = 1;
	}
	
	private void increaseIdentifierSize () {
		char[] result = new char [2 * array.length];
		copyElements(result, array, amountOfElements);
		array = result;		
	}
	
	private boolean isFull() {
		return amountOfElements == array.length;
	}
	
	public void add(char a) {
		if(isFull()) {
			increaseIdentifierSize();
		}
		
		array[amountOfElements++] = a;
 	}
	
	//should i write a remove method, if so, what should be it's parameters?

	public boolean isEmpty() {
		return amountOfElements == 0;
	}

	public int size() {
		return amountOfElements;
	}

	public boolean equals(Identifier other) {
		if (amountOfElements != other.amountOfElements)
			return false;
		
		for (int i = 0; i < amountOfElements; i++) {
			if (array[i] != other.array[i]) {
				return false;
			}	
		}
		return true;
	}
	
	public String toString() {
		String result = "";
		
		for(int i = 0; i < amountOfElements; i++) {
			result += array[i];
		}
		
		return "[ " + result + " ]";
	}
}
