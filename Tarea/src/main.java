
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Colas<Integer> Cola = new Colas<>();
		
		Cola.enqueue(4);
		Cola.enqueue(90);
		Cola.enqueue(15);
		Cola.enqueue(90);
		Cola.enqueue(8);
		Cola.enqueue(24);
		Cola.enqueue(777);
		
		System.out.println(Cola);
		
		Cola.dequeue();
		
		System.out.println(Cola);
		
			
	}

}
