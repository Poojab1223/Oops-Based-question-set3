package com.musicplayer;

public class Player {
	Track track1 = new Track("sona","sudeep",4);
	Track track2 = new Track("saiyaare", "Shreya Goshal", 3);
	
	Track[] listOfSongs = {track1, track2};
	
	void songInfo() {
		for(int i = 0; i < listOfSongs.length; i++) {
			System.out.println("title: "+listOfSongs[i].title+" artist: "+listOfSongs[i].title+" duration: "+listOfSongs[i].duration);
		}
		
	}
	Track[] getListOfSongs() {
		return this.listOfSongs;
	}
	void play(Track track) {
		track.play();
	}
	void pause(Track track) {
		track.pause();
	}
	void skip(Track track) {
		track.skip();
	}
	void repeat(Track track) {
		track.repeatTrack();
	}
}
