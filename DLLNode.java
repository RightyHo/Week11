public class DLLNode<T> {
	private T value;
	private DLLNode<T> prevNode;
	private DLLNode<T> nextNode;
	
	public DLLNode(T value){
		this.value = value;
		prevNode = null;
		nextNode = null;
	}
	public void addNode(DLLNode<T> newNode){
		if(this.nextNode == null){
			this.nextNode = newNode;
			newNode.prevNode = this;
		} else {
			this.nextNode.addNode(newNode);
		}
	}
	public boolean deleteNode(T removeElement){
		if(this.value.equals(removeElement)){
			this.prevNode.nextNode = this.nextNode;	
			this.nextNode.prevNode = this.prevNode;
			return true;
		} else if(this.nextNode == null){
			return false;
		} else {
			return this.nextNode.deleteNode(removeElement);
		}
	}
	public void printNode(){
		System.out.println("List Node Value: " + this.value);
	}
	public T getValue(){
		return this.value;
	}
	public DLLNode<T> getPrev(){
		return prevNode;
	}
	public DLLNode<T> getNext(){
		return nextNode;
	}
	public void setPrev(DLLNode<T> node){
		this.prevNode = node;
	}
	public void setNext(DLLNode<T> node){
		this.nextNode = node;
	}
}