public class OrderedList_inArraySlots{

  //FIELDS
  private List_inArraySlots list;

  //constructor
  public OrderedList_inArraySlots(){
    list = new List_inArraySlots();
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
    if (list.size() == 0) {
      list.add(value);
    } else {
      for (int i = 0; i < list.size(); i++) {
        if (value >= list.get(i)) {
          list.add(i + 1, value);
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
