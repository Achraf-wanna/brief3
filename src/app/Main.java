package app;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


import models.owl;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		
		owl owl = new owl(false,"Meat",2,20,"Deserts and forests","C:\\Users\\Admin\\Desktop\\owl.wav");
		System.out.println(owl.toString());
		System.out.println("owl sound : ");
		owl.ReadSound(owl.getSonowl());
		
		
		

	}

}
