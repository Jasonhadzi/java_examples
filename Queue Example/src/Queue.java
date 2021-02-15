
public class Queue {
	
		int[] qArray;
		int front,rear;
		int maxSize;
		int nItems;
		
	public Queue(int n) {
		// TODO Auto-generated constructor stub
		qArray = new int[n];
		front = 0;
		rear = 0;
		maxSize = n;
		nItems = 0;
		
	}
	
	
	public boolean isEmpty() {
		
		return (nItems==0);
		
		
		
	}
	
	public boolean isFull() {
		
		
		return (nItems == maxSize);
		
		
	}
	
	public int size() {
		
		return nItems;
		
		
	}
	
	public void insert(int x) {
		
		if(isFull()){
			
			System.out.println("Gemati seira");
		}else {
			
			if(rear +1==maxSize) {
				
				for (int i = 0; i < nItems; i++) {
					
			
				qArray[i] = qArray[front + i];
			
				}
			rear = nItems -1;
			front =0;
			
			}
			
			nItems++;
			rear++;
			qArray[rear] = x;
			
		}
		
	}
	
	public int remove() {
		if(isEmpty()){
			System.out.println("Adeia Oura");
			return -1;
		}else {
			front +=1;
			nItems -=1;
			return qArray[front-1];
			
		}
		
		
	}

	public int peek() {
		
		if(isEmpty()) {
			
			System.out.println("Oura adeia");
			return -1;
		}else {
			
			return qArray[front];
		}		
		
	}
}
