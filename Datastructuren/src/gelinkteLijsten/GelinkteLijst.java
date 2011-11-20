package gelinkteLijsten;

public abstract class GelinkteLijst {
	private Node first, last;
	private int size;
	
	public GelinkteLijst(){
		
	}
	
	Node getFirst(){
		return first;
	}
	
	Node getLast(){
		return last;
	}	
	
	void insertFirst(){}

	void insertLast(){}
	
	void insertBefore(){}
	
	void insertAfter(){}

	void remove(Object data){}
	
	
	boolean isFirst(Node current){
		return false; //dummy
	}
	
	boolean isLast(Node current){
		return false; //dummy	
	}
	
	int getSize(){
		return size;
	}
	
	protected int setSize(){
		return size;
	}
}
