import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Iterator;



public class Main {

	
	private static ArrayList<Album> albums = new ArrayList<Album>();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
		Album album = new Album("First album", "AC/DC");
		
		album.addSong("First album", 5.34);
		album.addSong("2nd track", 3.34);
		album.addSong("3rd track", 8.73);
		album.addSong("4th track", 6.34);
		album.addSong("5th track", 1.74);
		
		
		albums.add(album);
		
		
		album = new Album("Second album", "AC/DC");
		
		album.addSong("Second album", 5.34);
		album.addSong("2nd album track", 3.34);
		album.addSong("3rd album track", 8.73);
		album.addSong("4th album track", 6.34);
		album.addSong("5th album track", 1.74);
		
		albums.add(album);
		
		
		LinkedList<Song> playList = new LinkedList<Song>();
		
		albums.get(0).addToPlayList("First album", playList);
		albums.get(0).addToPlayList("3rd track", playList);
		albums.get(1).addToPlayList(2, playList);
		albums.get(1).addToPlayList(5, playList);
		albums.get(1).addToPlayList(3, playList);
		
		play(playList);
		
		
		
		
	}

	
	
	
	
	
	private static void play(LinkedList<Song> playList) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean quit = false;
		boolean forward = true;
		
		
		ListIterator<Song> listIterator = playList.listIterator();
		
		if(playList.size() == 0) {
			
			System.out.println("No songs in playlist");
		return;
		} else {
			System.out.println("Now playing: " + listIterator.next().toString());
			printMenu();
		}
		
		while(!quit) {
			
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch (action) {
			case 0:
				System.out.println("PlayList complete.");
				break;
			case 1:
				
				if(!forward){
					if(listIterator.hasNext()) {
						
						listIterator.next();
					}
					forward = true;
					
				}
				
				if(listIterator.hasNext()) {
					System.out.println("Now playing " + listIterator.next().toString());
					
				}
				else{
					System.out.println("We are at the end of the playlist");
					forward = false;
					
					}
				
				break;
			case 2:
				if(!forward){
					if(listIterator.hasPrevious()) {
						
						listIterator.previous();
					}
					forward = false;
					
				}
				
				if(listIterator.hasPrevious()) {
					System.out.println("Now playing " + listIterator.previous().toString());
					
				}
				else{
					System.out.println("We are at the start of the playlist");
					forward = true;
					
					}
				break;
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						
						System.out.println("Now replaying " + listIterator.previous().toString());
						forward = false;
						
					}else{
						
						System.out.println("We have reached the start of the list");
					}
						
						if(listIterator.hasNext()) {
							
							System.out.println("Now replaying " + listIterator.next().toString());
							forward = true;
						} else {
							
							System.out.println("We have reached the end of the list");
					}
					
					
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if(playList.size()>0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next());
					} else if(listIterator.hasPrevious()){
						System.out.println("Now playing " + listIterator.previous());
					}
				}
				break;
			}
			
			
			
			
		}
		
	}
	
	
	
	
	
	private static void printMenu() {
		
		System.out.println("Available Actions:\npress");
		System.out.println("0 - to quit\n 1 - to play next song\n 2 - to play previous song\n3 - to replay current song\n 4 - list songs in the playlist\n 5 - printMenu\n 6 - to delete current song from playlist");
		
		
	}
	
	private static void printList(LinkedList<Song> playList) {
		
		Iterator<Song> iterator = playList.iterator();
		
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
			
		}
		
	}
	
	
	
	
	
	
	
}
