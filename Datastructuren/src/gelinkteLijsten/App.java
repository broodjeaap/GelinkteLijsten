public class App {
	public static void main(String[] args) {
		Stapel<String> stapel = new Stapel<>();
		String[] test = new String[10];
		for(int a = 0;a < 10;++a){
			test[a] = "Hello"+a;
			stapel.push(test[a]);
		}
		String next = stapel.pop();
		while(next != null){
			System.out.println(next);
			next = stapel.pop();
		}
		
		
		System.out.println("\n\n\n\n");
		
		Wachtrij<String> w = new Wachtrij<String>();
		for(int a = 0;a < test.length;++a){
			w.enqueue(test[a]);
		}
		w.enqueue("Helemaal als laatste...");
		next = w.dequeue();
		while(next != null){
			System.out.println(next);
			next = w.dequeue();
		}
	}
}
