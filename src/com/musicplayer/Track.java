package com.musicplayer;

public class Track implements AudioMedias{
	public String title;
	public String artist;
	public int duration;
	private boolean isPlaying = false;
	private boolean isPaused = false;
	
	
	public Track(String title, String artist, int duration) {
		super();
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}
	@Override
	public void play() {
		if(this.isPlaying==false) {
		    this.isPlaying=true;
		    System.out.println("song playing");
		}
		else
			System.out.println("song playing");
		
	}
	@Override
	public void pause() {
		if(this.isPaused==false) {
		    this.isPaused=true;
		    System.out.println("song playing");
		}
		else
			System.out.println("song playing");
		
	}
	@Override
	public void skip() {
		System.out.println("song skipped"); 
	
		
	}
	@Override
	public void repeatTrack() {
		System.out.println("song repeated");
		
	}
}
