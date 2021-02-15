
public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q = new Queue(5);
		
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.insert(50);
		
	

	
	while(!q.isEmpty()){
		
		
		System.out.println(q.remove());
		
		
	}
		
	}

}
