import java.util.ArrayList;

public class PriorityStack {

	
	ArrayList<Job> stack;	//ola ta kanw initialise mesa stous constuctor 
	
	
	public PriorityStack() {
		// TODO Auto-generated constructor stub
		
		stack = new ArrayList<Job>();
		
	}
	
	public PriorityStack(int n) {
		
		stack = new ArrayList<Job>(n);		//initialize mesa sous constructor 
		
		
	}

	
	
	int size() {
		
		return stack.size();
		
	}
	
	boolean empty() {
		
		return (stack.size() == 0);
		
		
	}
	
	
	
	//meta kanw tin increase priority giati den mplekei taksinomisi
	
	boolean increasePriority(int p) {
		
		if(!stack.isEmpty() && p>0 ) {	//i empty() to idio einai
			for(int i=0; i<stack.size(); i++) {
				stack.get(i).priority = stack.get(i).priority + p;
				
			}	
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	//edw tha kanw taksinomisi
	
	double getMedianPriority() {
		if (empty()) return -1;
		
		if( size() %2 == 0) {
			
			int a = stack.get(size() / 2).priority;
			int b = stack.get((size() /2) -1).priority;
			
			return (double) (a+b)/ (double) 2;	//vazw kai panw kai katw gia na exw to kefal mou isixo
		}
		else {
			
			return stack.get( (int) size() /2 ).priority;
			
		}
		
		
	}
	
	void push(Job j) {
		
		if(empty()) {
			
			stack.add(j);
		}
		
		//gia tin periptwsi pou tha erthei kati megalytero apo ta idi yparxonta
		
		if (j.priority >= stack.get(size() -1).priority)
		{
					
					stack.add(j);
		}
		
		for(int i=0; i<stack.size(); i++)
		{
			
		if(j.priority < stack.get(i).priority) {
			stack.add(i, j);
			break;
			}
		
		}
		
		
		
		
		}
	
	Job pop() {
		
		if(empty()) {
			
			return new Job();
			
		}else {
			
			
			return stack.remove(size() -1);
			
		}
		
		
		
	}
	
	
	
}
