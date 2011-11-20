package gelinkteLijsten;

public abstract class GelinkteLijst {
	private Node first, last;
	
	public GelinkteLijst(){
		
	}
	
	public Node getFirst(){
		return first;
	}
	
	public Node getLast(){
		return last;
	}	
	
	public void insertFirst(){}

	public void insertLast(){}
	
	public void insertBefore(){}
	
	public void insertAfter(){}

	public void remove(Object data){}
	
	
	public boolean isFirst(Node current){
		return false; //dummy
	}
	
	public boolean isLast(Node current){
		return false; //dummy	
	}
	
}
