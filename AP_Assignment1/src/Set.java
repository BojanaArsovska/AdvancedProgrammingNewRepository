public class Set {

    public static final int INITIAL_AMOUNT_OF_IDENTIFIERS = 20;

    private Identifier[] identifiers;

    public Set() {}

    public Identifier[] getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(Identifier[] identifiers) {
        this.identifiers = identifiers;
    }

    public void init() {
        this.identifiers = new Identifier[INITIAL_AMOUNT_OF_IDENTIFIERS];
    }

    public void add(Identifier id, int index) {
        identifiers[index] = id;
    }


    boolean isUnique(Identifier id) {

        for (Identifier i: identifiers) {
            System.out.println("in isUnique " + i);
            if (identifiers.equals(id)) {
                return true;
            }
        }
        return false;
    }

    public String toString() { return ""; }
	/* PRE  -
	   POST - StringBuilder identifier is turned into a string and returned
	*/

}






