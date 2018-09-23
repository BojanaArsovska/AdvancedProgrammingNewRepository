public interface IdentifierInterface {
    /*
     * Elements: Characters of type char
     * Structure: Linear
     * Domain:
     * 	- first letter is a alphabetic character
     *  - only alphanumeric characters
     *  - minimum of 1 character
     *
     * Identifier ();
     *   PRE  - N/A
     *   POST - default constructor.
     *
     * Identifier (char a);
     *   PRE  - N/A
     *   POST - A new Identifier-object has been made and contains an Identifier object with a dummy ('a') alphabetic character.
     *
     * Identifier (Identifier src);
     *   PRE  - N/A
     *   POST - A new Identifier-object has been made and contains a deep copy of src.

     misc sander notes
        -(for example) for push there is no pre condition but there could be,
            there is none becuase its easier to have something else check it by checking something outside of the class
        -if the first character is a space or a random character throw an exception like extract the curly bracket first and ask for the set again
        -initialize the object with "a" which then gets overwritten so that an identifier is never empty
            gets overwritten by function called init(char a);
        -every ADT needs an init()
        -add function
        -remove function needs to check that the identifier is empty
        -get function
        -The identifiers must have the following properties:
        -Only alphanumeric characters are allowed as elements of an identifier
        -An identifier begins with a letter
        -Identifiers have a length of at least 1 character.
    */
    void init(char a);
	/* PRE  -
	   POST - initializes an identifier with the user input,
	   		  the char argument is placed at the front of the StringBuilder,
	   		  this method overwrites the dummy character.
	*/

    void add(char a);
	/* PRE  - an Identifier exists
	   POST - a character is added to the
	*/

    void remove(int startIndex, int endIndex);
	/* PRE  - an Identifier exists and cannot remove the last character from the identifier (i.e. domain must hold at any time)
	   POST - a character at the last index is removed from the StringBuilder object
	*/

    void set(int index, char a);
	/* PRE  - an Identifier exists
	   POST - a character is set at an index in the StringBuilder object
	*/

    char getChar(int index);
	/* PRE  - an Identifier exists
	  		- the index is not out of bounds
	   POST - a character from the identifier is returned
	*/

    String toString();
	/* PRE  -
	   POST - StringBuilder identifier is turned into a string and returned
	*/
}
