
public class Identifier {
	
	private StringBuffer word;
	private boolean inBoth;
	private boolean isUnique;
	
	public Identifier() {}
	
	public Identifier(StringBuffer word, boolean inBoth, boolean isUnique) {
		this.word = word;
		this.inBoth = inBoth;
		this.isUnique = isUnique;
	}

	
	
	public boolean getInBoth() {
		return this.inBoth;
	}
	
	public boolean getIsUnique() {
		return this.isUnique;
	}
	
	public void setInBoth(boolean inBoth) {
		this.inBoth = inBoth;
	}
	 
	public void setIsUnique(boolean isUnique) {
		this.isUnique = isUnique;
	}
}
