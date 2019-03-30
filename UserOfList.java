//Used some of UserOfList from solutionsHolmes/50_List_inArraySlots_v1 but altered to fit OrderedList_inArraySlots

public class UserOfList {

  private static OrderedList_inArraySlots list;

  public static void main (String[] args) {

    list = new OrderedList_inArraySlots ();

    System.out.println( "number of elements: " + list.size() );
    System.out.println( "empty list: " + list);

    /* Populate the list with elements, but with a small enough
          number that we expect no invocation of expand().
    */
    int elemIndex;
    for( elemIndex = 0; elemIndex < 5; elemIndex++ ) {
       list.add( -elemIndex); // differs from index, but similar
       System.out.println( "number of elements: " + list.size() );
    }

    System.out.println("initial population of " + list.size() + " elements:");
    System.out.println( list + System.lineSeparator());

    // Add enough elements that expansion is expected
    for( ; elemIndex < 15; elemIndex++ ) {
      if( list.size() == 10) System.out.println( "expansion expected");
        list.add( -elemIndex);
        System.out.println( "number of elements: " + list.size() );
    }
    System.out.println("result of second population: " + list.size() + " elements:");
    System.out.println( list + System.lineSeparator());

    // Trust no one.
    for( ; elemIndex < 35; elemIndex++ )
        list.add(elemIndex);
    System.out.println("result of third population: " + list.size() + " elements:");
    System.out.println( list + System.lineSeparator());

    // test accessor
    System.out.println( "sample elements from list:");
    for( elemIndex = 1; elemIndex < list.size(); elemIndex *= 2 ) {
      System.out.println( "element " + elemIndex + ": "
      + list.get( elemIndex)
      );
    }
    // test removing an element
    System.out.println("removing value " + list.remove( 6)
    + ", leaving " + list.size() + " elements:");
    System.out.println( list);
    System.out.println(
    "expecting:" + System.lineSeparator()
    + "[-14,-13,-12,... NO -8 HERE!,-7,...,0,15,16,17,...,32,33,34,]");
  }  // end of main()

}
