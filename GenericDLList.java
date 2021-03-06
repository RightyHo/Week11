/**
 * Implementation of Generic Doubly Linked List
 */
public class GenericDLList<T> implements DoubleLinkList<T> {
	private DLLNode<T> listStart;

	public GenericDLList(){
		listStart = null;
	}
	/**
	 * Adds a new element to the list
	 */
	public void addElement(T newElement){
		DLLNode<T> newNode = new DLLNode<T>(newElement);
		if(listStart == null){
			listStart = newNode;
			//leave prevNode and nextNode pointers set to null
		} else {
			listStart.addNode(newNode);
		}
	}
	/**
	 * Deletes a node from the list
	 */
	public boolean deleteElement(T removeElement){
		if(listStart.getValue() == removeElement){	//DLLNode uses an alternate test: if(this.value.equals(removeElement))
			if(listStart.getNext() == null){
				listStart = null;
			} else {
				listStart = listStart.getNext();
				listStart.setPrev(null);				//removing previous pointer to the deleted element
			}
			return true;
		} else {
			return listStart.getNext().deleteNode(removeElement);
		}
	}
	/**
	 * Prints out list
	 */
	public void printList(){
		DLLNode<T> focusNode = listStart;
		while(focusNode != null){
			focusNode.printNode();
			focusNode = focusNode.getNext();
		}
	}
	/**
	 * Returns the number of nodes in the list
	 */
	public int listLength(){
		int result = 0;
		DLLNode<T> focusNode = listStart;
		if(focusNode != null){
			result++;
		}
		while(focusNode.getNext() != null){
			result++;
			focusNode = focusNode.getNext();
		}
		return result;
	}
}