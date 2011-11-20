package gelinkteLijsten;

public class Stapel extends GelinkteLijst {
	/**
	 * Zet een object boven op de stapel
	 * @param object
	 */
	void push(Object object){}
	
	/**
	 * Haalt het bovenste object v an de stapel
	 * @return het bovenste object
	 */
	Object pop(){return new Object();}
	
	/**
	 * Geeft het bovenste object terug, maar 
	 * laat het op de stapel staan.
	 * @return
	 */
	Object front(){return new Object();}

	/**
	 * Geeft 'true' als er niks op de stapel ligt.
	 * @return
	 */
	boolean isEmpty(){return false;}
}
