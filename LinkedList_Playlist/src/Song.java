
public class Song {

	
	private String title;
	private double duration;
	
	
	
	
	
	
	
	public Song(String title, double duration) {
		// TODO Auto-generated constructor stub
		
		this.title = title;
		this.duration = duration;
		
		
	}

	
	public String getTitle(){
		
		return title;
		
	}
	
	@Override
	//yparxei idi afti i sinartisi stin java 
	//opote egw tin kanw override gia na tin xrisimopoiisw opws thelw egw
	
	public String toString() {
		
		return this.title + ": " + this.duration;
		
	}
	
}
