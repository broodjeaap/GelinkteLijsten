public class Node<T> {
	
	public T data;
	
	public Node<T> next, previous;
	
	public Node(T d){
		data = d;
	}
	
	public Node(Node<T> p, T d){
		next = p;
		data = d;
	}
	
	public Node(T d,Node<T> n){
		next = n;
		data = d;
	}
	
	public Node(Node<T> p, T d, Node<T> n){
		next = n;
		data = d;
		previous = p;
	}
}