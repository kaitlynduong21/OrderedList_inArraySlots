public class OrderedList_inArraySlots{

  //FIELDS
  private List_inArraySlots list;

  //constructor
  public OrderedList_inArraySlots(){
    list = new List_inArraySlots();
  }

  /** size method
    @return the number of elements in this list
   */
  public int size() {
      return list.size();
  }

  /** toString method
    @return a string representation of this list,
    in [a,b,c,] format
   */

  public String toString() {
    return list.toString();
  }

  /* add method
    Adds @value to the list at the correct position.
    @return true
   */

  public boolean add(int value){
    if (size() == 0 || value >= list.get(size() - 1)) {
      list.add(value);
    } else {
      for (int i = 0; i < size(); i++) {
        if (value <= list.get(i)) {
          list.add(i, value);
          i = size();
        }
      }
    }
    return true;
  }

  /** remove method
   Remove the element at position @index in this list.
   Shift any subsequent elements to the left (that is,
   decrease the index associated with each).
   @return the value that was removed from the list
  */

  public int remove(int index) {
    return list.remove(index);
  }

  /** get method
    @return element @index from this list
    precondition: @index is within the bounds of the array.
        (Having warned the user about this precondition,
         you should NOT complicate your code to check
         whether user violated the condition.)
   */

  public int get (int index) {
    return list.get(index);
  }
}
