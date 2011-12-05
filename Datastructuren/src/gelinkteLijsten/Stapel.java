public class Stapel<T>{
	private Node<T> first;
	private int size = 0;
	/**
	 * Zet een object boven op de stapel
	 * @param object
	 */
	void push(T object){
		Node<T> tmp = first;
		first = new Node<T>(object, tmp);
		size++;
	}
	
	/**
	 * Haalt het bovenste object v an de stapel
	 * @return het bovenste object
	 */
	public T pop(){
		if(first != null){
			Node<T> tmp = first;
			first = tmp.next;
			size--;
			return tmp.data;
		}
		return null;
	}
	
	/**
	 * Geeft het bovenste object terug, maar 
	 * laat het op de stapel staan.
	 * @return
	 */
	public T front(){
		return ((first == null) ? null : first.data);
	}

	/**
	 * Geeft 'true' als er niks op de stapel ligt.
	 * @return
	 */
	public boolean isEmpty(){
		return ((first == null) ? true : false);
	}
	
	public int getSize(){
		return size;
	}
}
