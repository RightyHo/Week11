/**
 * Implementation of Generic Doubly Linked List 
 */
public class GenericDLList<T> implements DoubleLinkList<T> {
	private DLLNode listStart;
	
	public GenericDLList(){
		listStart = null;
	}
	/**
	 * Adds a new element to the list
	 */
	public void addElement(T newElement){
		DLLNode newNode = new DLLNode(newElement);
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
			listStart = listStart.getNext();
			listStart.setPrev(null);				//removing previous pointer to the deleted element
			return true;
		} else {
			return listStart.getNext().deleteNode(removeElement);
		}
	}
	/**
	 * Prints out list
	 */
	public void printList(){
		DLLNode focusNode = listStart;
		while(focusNode != null){
			focusNode.printNode();
			focusNode = focusNode.getNext();
		}
	}
	/**
	 * Returns the number of nodes in the list
	 */
	public int listLength(DLLNode aNode){
		if(aNode == null){
			return 0;
	} else {
		int result = 1 + listLength(aNode.getNext());
		return result;
		}
	}
}