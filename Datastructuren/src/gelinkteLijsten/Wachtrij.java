/**
 * Een wachtrij (queue) werkt via het 
 * first-in first-out principe; elementen worden toegevoegd 
 * aan de achterkant en worden verwijderd aan de voorkant.
 * 
 * In deze klasse implementeer je een Queue door alleen 
 * maar gebruik te maken van de opslag methode die de 
 * klasse GelinkteLijst je biedt. De Node komt niet voor in deze klasse!
 * 
 * In [Hubbard, hoofdstuk 6] wordt de Queue besproken.
 * 
 * @author Youri 
 *
 */
public class Wachtrij<T>{
	private Node<T> first, last;
	private int size = 0;
	/**
	 * Zet iets in de wachtrij
	 * aan de achterkant: FIFO
	 */
	public void enqueue(T o){
		if(last != null){
			Node<T> tmp = last;
			last = new Node<T>(tmp, o);
			tmp.previous = last;
		} else{
			last = new Node<T>(o);
			first = last;
		}
	}
	
	/**
	 * Haal iets van de wachtrij
	 * Aan de voorkant: FIFO
	 */
	public T dequeue(){
		if(first != null){
			T tmp = first.data;
			first = first.previous;
			if(first != null){
				first.next = null;
			}
			return tmp;
		}
		return null;
	}
	
	/**
	 * Het aantal elementen in de wachtrij
	 * @return
	 */
	public int size(){
		return size;
	}
	
	/**
	 * Bekijk het eerste element in de wachtrij, 
	 * maar haalt het niet er vanaf. 
	 * Note: het eerste element is als eerste toegevoegd.
	 * @return
	 */	
	public T front(){
		return ((first == null) ? null : first.data);
	}
}
