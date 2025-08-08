package com.musicplayer;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Player player = new Player();
		player.songInfo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the song which you want to play");
		int number = scanner.nextInt();

		Track[]songs=player.getListOfSongs();
		while(true) {
			System.out.println("1:Play\n 2:pause \n 3.Skip\n 4.repeat\n");
			System.out.println("enter you choice");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1 : player.play(songs[number]);
			         break;
			case 2 : player.pause(songs[number]);
		                 break;
			case 3 : player.skip(songs[number]);
                                 break;
			case 4 : player.repeat(songs[number]);
			         break;
                        case 5 : System.out.println("exiting!!!!!!!!!.........");
				 return;
			default : System.out.println("no matches found");
			}
		}
	}
}
