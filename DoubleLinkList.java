/**
 * A Generic Doubly Linked List
 */
public interface DoubleLinkList<T> {
	/**
	 * Adds a new element to the list
	 */
	void addElement(T newElement);
	/**
	 * Deletes a node from the list
	 */
	boolean deleteElement(T removeElement);
	/**
	 * Prints out list
	 */
	void printList();
	/**
	 * Returns the number of nodes in the list
	 */
	int listLength();
}