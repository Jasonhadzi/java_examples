import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.text.TabableView;

public class Album {

	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	
	public Album(String nam, String artist) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
		
	}

	public boolean addSong(String title, double duration) {
		
		if(findSong(title) == null) {
			
			this.songs.add(new Song(title, duration));
			return true;
		}
		
		return false;
		
	}
	
	
	
	
	private Song findSong(String title) {
		
		 
		//alternate way to go through a list of entries (for-each)
		//goes through and creates a variable checkedSong for every entry on the ArrayList this.songs
		//its a shortcut instead for for(i<this.songs.size()), Song checkedSong = this.songs.get(i)
		
		for(Song checkedSong: this.songs){
			
			if(checkedSong.getTitle().equals(title)) {
				
				return checkedSong;
			}
			
		}
		
		return null;
		
	}
	
	
	
	
	public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
		
		//tracknumber starts from 1 but the arraylist starts from 0
		//
		int index = trackNumber -1;
		
		if((index >0) && (index <= this.songs.size())) {
			
			
			playList.add(this.songs.get(index));
			return true;
			
		}
		System.out.println("This album does not have a track "+ trackNumber);
		return false;
	}
		
	
	public boolean addToPlayList(String title, LinkedList<Song> playList) {
		
		Song checkedSong = findSong(title);
		
		if(checkedSong != null) {
			
			
			playList.add(checkedSong);
			return true;
			
		}
		System.out.println("The song: " + title+ " is not in this album");
		return false;
	}
		
	

	
	
	
}
