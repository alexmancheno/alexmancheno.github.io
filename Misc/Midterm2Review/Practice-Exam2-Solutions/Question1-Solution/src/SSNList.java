
// LinkedList.java
// 
// This version uses three instance variables,
// a pointer to the first node, a pointer to
// the last node, and length, to make our
// append and getLength methods more efficient
// than the would be if our only instance
// variable were a pointer to the first node.
//
// This version uses a dummy first node.  Hence
// it needs less decision-making than it would
// need if a dummy first node were not used.
//

/**
 * Encapsulates a linked list of <code>String</code>.
 */
public class SSNList {

	/** First node in linked list - dummy node */
	private SSNNode first = new SSNNode(null);

	/** Last node in linked list */
	private SSNNode last = first;

	/** Number of data items in the list. */
	private int length = 0;

	/**
	 * Gets the number of data values currently stored in this LinkedList.
	 * 
	 * @return the number of elements in the list.
	 */

	public int getLength() {
		return length;
	}

	/**
	 * Appends a String data element to this LinkedList.
	 * 
	 * @param data
	 *            the data element to be appended.
	 */
	public void append(String d) {
		// TODO Code here for append
		last = last.next = new SSNNode(d);
		length++;
	} // method append(String)

	/**
	 * Prepends (adds to the beginning) a String data element to this
	 * LinkedList.
	 * 
	 * @param data
	 *            the data element to be prepended.
	 */
	public void prepend(String d) {
		if(length==0) {
			append(d);
		} else {
			SSNNode toAdd = new SSNNode(d);
			toAdd.next = first.next;
			first.next = toAdd;
			length++;
		}
	} // method append(String)

	/**
	 * @return String representation of elements in linked list delimited by a
	 *         space character
	 */
	public String toString() {
		SSNNode p = first.next;
		String returnString = "";
		while (p != null) {
			returnString += p.data + " ";
			p = p.next;
		}
		return returnString;
	}

	/**
	 * Determines whether this ShortSequenceLinkedList is equal in value to the
	 * parameter object. They are equal if the parameter is of class
	 * ShortSequenceLinkedList and the two objects contain the same short
	 * integer values at each index.
	 * 
	 * @param other
	 *            the object to be compared to this ShortSequenceLinkedList
	 * 
	 * @return <code>true</code> if the parameter object is a
	 *         ShortSequenceLinkedList containing the same numbers at each index
	 *         as this ShortSequenceLinkedList, <code>false</code> otherwise.
	 */
	public boolean equals(Object other) {
		if (other == null || getClass() != other.getClass()
				|| length != ((SSNList) other).length)
			return false;

		SSNNode nodeThis = first;
		SSNNode nodeOther = ((SSNList) other).first;
		while (nodeThis != null) {
			// Since the two linked lists are the same length,
			// they should reach null on the same iteration.

			if (nodeThis.data != nodeOther.data)
				return false;

			nodeThis = nodeThis.next;
			nodeOther = nodeOther.next;
		} // while

		return true;
	} // method equals
	
	
	// Question 1 Solution - class method solution
	public static void printSSNList(SSNList in) {
		SSNNode p = in.first.next;
		while(p!=null) {
			System.out.println(p.data);
			p = p.next;
		}
	}
	
	// Question 1 Solution - instance method solution
	public void printSSNList() {
		SSNNode p = first.next;
		while(p!=null) {
			System.out.println(p.data);
			p = p.next;
		}
	}


} // class LinkedList

