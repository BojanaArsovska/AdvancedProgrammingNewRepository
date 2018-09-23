class Set implements SetInterface{
	public static final int MAX_AMOUNT_OF_ELEMENTS = 20;
	private static final int INITIAL_AMOUNT_OF_ELEMENTS = 0;

    private Identifier[] elements;
    private int amountOfElements;
     
    public Set() {
    	elements = new Identifier[INITIAL_AMOUNT_OF_ELEMENTS];
    	amountOfElements = 0;
    }
    
    private void copyElements (Identifier[] dest, Identifier[] src, int amount){
		for (int i = 0; i < amount; i++) {
			dest[i] = new Identifier(src[i]);
		}
	}
	
	public Set (Set src) {
		elements = new Identifier [src.elements.length];
		amountOfElements = src.amountOfElements;
		copyElements(elements, src.elements, amountOfElements);
	}
   
	public void init() {
		amountOfElements = 0;
	}
	
	private boolean isFull() {
		return amountOfElements == elements.length;
	}
	
	private void increaseSetSize() {
		Identifier[] result;
		
		if (elements.length == INITIAL_AMOUNT_OF_ELEMENTS) 
			result = new Identifier[INITIAL_AMOUNT_OF_ELEMENTS + 1];
		else
			result = new Identifier[2 * elements.length];
		
		copyElements(result, elements, amountOfElements);
		elements = result;
	}

	public void add(Identifier identifier) {
		if (!contains(identifier)) {
			if(isFull()) {
				increaseSetSize();
			}
			
			elements[amountOfElements++] = new Identifier(identifier);
		}
	}

	public void remove(Identifier identifier) {
		Set temp = new Set();
		
		for(int i=0; i<amountOfElements; i++) {
			if(elements[i].equals(identifier)) {
				continue;
			}
			temp.add(elements[i]);
		}
		
		elements = temp.elements; //check later
	}
		
	public boolean isEmpty() {
		return amountOfElements == 0;
	}

	public int size() {
		return amountOfElements;
	}

	public boolean equals(Set other) {
		if(amountOfElements != other.size())
			return false;
		
		int count = 0;
		for(int i=0; i<amountOfElements; i++) {
			if(other.contains(elements[i]))
				count++;
		}
		
		return count == amountOfElements;
	}

	public boolean contains(Identifier identifier) {
		for (int i = 0; i < amountOfElements; i++) {
			if (elements[i].equals(identifier)) {
				return true;
			}
		}
		
		return false;
	}

	public Set union(Set other) {
		Set result = new Set(this);
		
		for(int i=0; i<other.size(); i++) {
			if(!result.contains(other.elements[i]))
				result.add(other.elements[i]);
		}
		
		return result;
	}

	public Set difference(Set other) {
		Set result = new Set(this);
		
		for (int i=0; i < other.size(); i++) {
			if (result.contains(other.elements[i]))
				result.remove(other.elements[i]);
		}
		
		return result;
	}

	public Set intersection(Set other) {
		Set result = new Set(this);
		
		for(int i=0; i<other.size(); i++) {
			if(result.contains(other.elements[i]))
				result.add(other.elements[i]);
		}
		
		return result;
	}

	public Set symmetricDifference(Set other) {
		Set result = this.union(other);
		Set intersection = this.intersection(other);
		
		for(int i=0; i<intersection.size(); i++) {
			result.remove(intersection.elements[i]);
		}
		
		return result;
	}

	public String toString() {
		String result = "{ ";
		
		for(int i =0; i<amountOfElements-1; i++) {
			result += elements[i].toString() + " ";
		}
		
		result += elements[amountOfElements - 1] + " }";
		
		return result;
	}
}
