//used solution from solutionsHolmes/50_List_inArraySlots_v1

/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    private int[] elements;     // container for the elements of the list
    private int filledElements; // the number of elements in this list

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        elements = new int[ INITIAL_CAPACITY];
        // filledElements has been initialized to the desired value, 0
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
        return filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
        String result = "[";
        for( int elemIndex = 0; elemIndex < filledElements; elemIndex++)
            result += elements[ elemIndex] + ",";
        return result + "]";
    }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     private void expand() {
        System.out.println( "expand... (for debugging)");
           /* S.O.P. rules for debugging:
              Working methods should be silent. But during
              development, the programmer must verify that
              this method is called when that is appropriate.
              So test using the println(), then comment it out.
              */
        int[] bigger = new int[ elements.length * 2];
        for( int elemIndex = 0; elemIndex < filledElements; elemIndex++)
            bigger[ elemIndex] = elements[ elemIndex];
        elements = bigger;
     }

    // --------- end of "code that worked in v0" ---------


    // accessors
    /**
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether user violated the condition.)
     */
    public int get( int index ) {
        // E-Z! pass through the request to the array object
        return elements[ index];
    }


    /**
      Set value at @index to @newValue
      @return old value at @index
      @precondition: @index is within the bounds of this list.
     */
    public int set( int index, int newValue ) {
        int saveForReturn = get( index);
        elements[ index] = newValue;
        return saveForReturn;
    }


     /**
      Remove the element at position @index in this list.
      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).
      @return the value that was removed from the list
     */
    public int remove( int index) {
        int result = elements[ index];  // save for returning

        for( int put = index; put < filledElements-1; put++)
             elements[ put] = elements[ put+1];

        filledElements--;
        return result;
    }
}
