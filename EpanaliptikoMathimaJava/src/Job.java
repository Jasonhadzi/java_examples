
public class Job {

	 int priority;			//an den valw private den xreiazetai getters setters
	 String name;
	
	
	
	
	//prepei na ftiaksw 2 constractors de facto pada!!!!
	public Job() {
		// TODO Auto-generated constructor stub
		
		
		priority = -1;
		name = " ";
	}
	
	public Job(int p, String n) {
		
		priority = p;
		name = n;
		
		
	}

}


//		aftes einai oi sinartiseis pou prepei na ftiaksw prepei na ta kanw egw
//		void push(job)
//		Job pop()
//		int size()
//		boolean empty()
//		double getMedianPriority()
//		boolean increasePriority(int p)
//		----------------

//		diafores sinartiseis stin ArrayList<> yparxoun idi
//		void add(int i, Object e)
//		boolean add(Object e)
//		Object remove(int i)
//		int size()
//		Object set(int i, Object e)